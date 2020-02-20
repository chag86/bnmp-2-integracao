package br.com.clientegatewayexterno.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.http.client.ClientProtocolException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.clientegatewayexterno.dto.mandadoprisao.EspeciePrisaoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.MandadoPrisaoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.RegimePrisionalDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.SigiloDTO;
import br.com.clientegatewayexterno.dto.pessoa.PessoaDTO;
import br.com.clientegatewayexterno.dto.pessoa.PessoaSemPecasDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.dto.token.Token;
import br.com.clientegatewayexterno.util.PropertiesFile;

/**
 * Classe para a criação do objeto MandadoPrisao.<br>
 * 
 * A classe é responsavel por criar o objeto e consumir os serviços rest da API para salvar e consultar.
 */
public class MandadoPrisaoService {
	private PessoaDTO pessoaDTO;
	private String urlBase;	
	Token token;
		
	/**
	 * Construtor que recebe os objetos PessoaDTO, AuthenticationResponseDTO e inicialização de variaveis
	 * 
	 * @param pessoaDTO Objeto de transferência
	 * 
	 * @param respDTO Objeto de transferência com os tokens de autenticação
	 * 
	 * @throws IOException 
	 */
	public MandadoPrisaoService(PessoaDTO pessoaDTO,Token token) throws IOException{
		this.pessoaDTO = pessoaDTO;
		this.token = token;
		urlBase = PropertiesFile.getValor("url");
	}
	
	/**
	 * Método para obter um objeto MandadoPrisaoDTO do banco
	 * 
	 * @param id Número de identificação do madadoPrisao que deseja consultar
	 * 
	 * @return Retorna um objeto PessoaDTO
	 */
	public MandadoPrisaoDTO obterMandadoPrisao(Long id){
		RestTemplate restTemplate = new RestTemplate();
		HashMap<String,Long> urlVariables = new HashMap<String, Long>();
		urlVariables.put("id", id);				
		ResponseEntity<MandadoPrisaoDTO> mandadoPrisaoDTO = restTemplate.getForEntity(urlBase + "/api/mandado-prisaos/{id}", 
				MandadoPrisaoDTO.class, urlVariables);
		return mandadoPrisaoDTO.getBody();     
	}	
	
	/**
	 * Método para criar o objeto MandadoPricaoDTO para ser salvo no banco
	 * 
	 * @return Retorna Objeto MandadoPricaoDTO para ser salvo no banco
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public MandadoPrisaoDTO criarMandadoPrisaoDTO()throws ClientProtocolException, IOException, IllegalAccessException, InvocationTargetException{
		MandadoPrisaoDTO mandadoPrisaoDTO = new MandadoPrisaoDTO();
		
		PessoaSemPecasDTO pessoaSemPecaDTO = new PessoaSemPecasDTO();		
		BeanUtils.copyProperties(pessoaSemPecaDTO,pessoaDTO );
		mandadoPrisaoDTO.setPessoa(pessoaSemPecaDTO);
		mandadoPrisaoDTO.setNumeroProcesso("11111111111111111111");
		mandadoPrisaoDTO.setDataExpedicao(LocalDate.of(2017, Month.JUNE, 1));
		mandadoPrisaoDTO.setDataValidade(LocalDate.of(2017, Month.DECEMBER, 1));
		mandadoPrisaoDTO.setOrgaoJudiciario(criarOrgaoDTO());		
		mandadoPrisaoDTO.setSinteseDecisao("Sintese...");
		mandadoPrisaoDTO.setCumprimento("O(A) Doutor(a) xxx, Juiz de Direito da xxx, na forma da lei, etc."
										+ "MANDA o Senhor Oficial de Justiça, ou a Autoridade Policial, a quem "
										+ "este for apresentado, que, em cumprimento"
										+ " ao presente, extraído dos autos acima indicados, EFETUE A PRISÃO "
										+ "da pessoa acima mencionada, cientificando-a do motivo da prisão, "
										+ "e observando-se as disposições do art. 5°, incisos LXII, LXIII e LXIV"
										+ " da Constituição Federal, consoante decisão junto ao feito em referência.");
		mandadoPrisaoDTO.setNomeServidor("Servidor A");
		mandadoPrisaoDTO.setCargoServidor("Cargo A");
		mandadoPrisaoDTO.setMagistrado("Magistrado A");
		mandadoPrisaoDTO.setAssinarDigitalmenteServidor(false);
		mandadoPrisaoDTO.setAssinarDigitalmenteMagistrado(false);
		mandadoPrisaoDTO.setEspeciePrisao(criarEspeciePrisaoDTO());
		mandadoPrisaoDTO.setRegimePrisional(new RegimePrisionalDTO());	
		mandadoPrisaoDTO.setSigilo(criarSigiloDTO());
		mandadoPrisaoDTO.setObservacao("");
		
		salvar(mandadoPrisaoDTO);
		
		return null;
	}
	
	/**
	 * Método para salvar o objeto MandadoPrisaoDTO
	 * 
	 * @param mandadoPrisaoDTO Objeto de transferência
	 * 
	 * @return Retorna Objeto PandadoPrisaoDTO com id salvo no banco
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 */
	private MandadoPrisaoDTO salvar(MandadoPrisaoDTO mandadoPrisaoDTO)throws ClientProtocolException, IOException{
		RestTemplate restTemplate  = new RestTemplate();	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("X-XSRF-TOKEN", token.getAuthenticationResponseDTO().getToken_csrf());
		headers.add("Cookie", token.getCookie());
		headers.add("Authorization","Bearer "+token.getAuthenticationResponseDTO().getToken_jwt());
		HttpEntity<MandadoPrisaoDTO> entity = new HttpEntity<>(mandadoPrisaoDTO,headers);	
		ResponseEntity<MandadoPrisaoDTO> mandadoPrisaoDTODTOResponse = restTemplate.exchange(urlBase + "/api/mandado-prisaos", HttpMethod.POST, entity
		    , MandadoPrisaoDTO.class);						
		return mandadoPrisaoDTODTOResponse.getBody();		
	}
	
	/**
	 * Método para criar o objeto OrgaoDTO do mandado de prisão
	 * 
	 * @return Retorna objeto OrgaoDTO
	 */
	private OrgaoDTO criarOrgaoDTO(){
		OrgaoDTO orgaoDTO = new OrgaoDTO();
		orgaoDTO.setId(12750L);
		return orgaoDTO;
	}	
	
	/**
	 * Método para criar o objeto EspeciePrisaoDTO do mandado de prisão
	 * 
	 * @return Retorna objeto EspeciePrisaoDTO
	 */
	private EspeciePrisaoDTO criarEspeciePrisaoDTO(){
		EspeciePrisaoDTO especiePrisaoDTO = new EspeciePrisaoDTO();
		especiePrisaoDTO.setId(1L);
		return especiePrisaoDTO;
	} 
	
	/**
	 * Método para criar o objeto SigiloDTO do mandado de prisão
	 * 
	 * @return Retorna objeto SigiloDTO
	 */
	private SigiloDTO criarSigiloDTO(){
		SigiloDTO sigiloDTO = new SigiloDTO();
		sigiloDTO.setId(1L);
		return sigiloDTO;
	}
}
