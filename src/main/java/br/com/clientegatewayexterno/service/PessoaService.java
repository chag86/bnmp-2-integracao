package br.com.clientegatewayexterno.service;


import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import br.com.clientegatewayexterno.dto.mandadoprisao.SinaisMarcasDTO;
import br.com.clientegatewayexterno.dto.pessoa.DadosGeraisPessoaDTO;
import br.com.clientegatewayexterno.dto.pessoa.EnderecoDTO;
import br.com.clientegatewayexterno.dto.pessoa.EscolaridadeDTO;
import br.com.clientegatewayexterno.dto.pessoa.EstadoCivilDTO;
import br.com.clientegatewayexterno.dto.pessoa.EstadoDTO;
import br.com.clientegatewayexterno.dto.pessoa.MunicipioDTO;
import br.com.clientegatewayexterno.dto.pessoa.PaisDTO;
import br.com.clientegatewayexterno.dto.pessoa.PessoaDTO;
import br.com.clientegatewayexterno.dto.pessoa.SexoDTO;
import br.com.clientegatewayexterno.dto.pessoa.StatusPessoaDTO;
import br.com.clientegatewayexterno.dto.token.Token;
import br.com.clientegatewayexterno.util.PropertiesFile;


/**
 * Classe para a criação do objeto Pessoa.<br>
 * 
 * A classe é responsavel por criar o objeto e consumir os serviços rest da API para salvar e consultar.
 */
public class PessoaService {
	
	private String urlBase;	
	Token token;
	
	/**
	 * Construtor que recebe os objetos AuthenticationResponseDTO e inicialização de variaveis
	 * 
	 * @param respDTO Objeto de transferência com os tokens de autenticação
	 * 
	 * @throws IOException 
	 */
	public PessoaService(Token token) throws IOException{
		this.token = token;
		urlBase = PropertiesFile.getValor("url");
	}
	
	
	/**
	 * Método para criar o objeto PessoaDTO para ser salvo no banco
	 * 
	 * @return Retorna objeto PessoaDTO para ser salvo no banco
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 */
	public PessoaDTO criarPessoaDTO()throws ClientProtocolException, IOException{
		DadosGeraisPessoaDTO dadosGeraisPessoaDTO = new DadosGeraisPessoaDTO();
		dadosGeraisPessoaDTO.setNome("Pessoa1");
		dadosGeraisPessoaDTO.setAlcunha("Pessoa1.1");
		dadosGeraisPessoaDTO.setNomePai("Pai da Pessoa1");
		dadosGeraisPessoaDTO.setNomeMae("Mãe da Pessoa1");
		dadosGeraisPessoaDTO.setAlcunha("Pessoa1 alcunha");
		dadosGeraisPessoaDTO.setIdTribunal(2L);
		dadosGeraisPessoaDTO.setEndereco(criarEnderecoDTO().get(0));		
		dadosGeraisPessoaDTO.setDataNascimento(LocalDate.of(1990, Month.JANUARY, 1));
		dadosGeraisPessoaDTO.setEstadoCivil(criarEstadoCivilDTO());
		dadosGeraisPessoaDTO.setEscolaridade(criarEscolaridadeDTO());
		dadosGeraisPessoaDTO.setSexo(criarSexoDTO());		
		
		PessoaDTO pessoaDTO = new PessoaDTO();		
		pessoaDTO.setAtivo(true);
		pessoaDTO.setEnderecos(criarEnderecoDTO());
		pessoaDTO.setDadosGeraisPessoa(dadosGeraisPessoaDTO);		
		pessoaDTO.setSinaisMarcas(new SinaisMarcasDTO());	
		pessoaDTO.setStatusPessoa(criarStatusPessoaDTO());		
			
		return salvar(pessoaDTO);		
	}
	
	/**
	 * Método para salvar o objeto PessoaDTO
	 * 
	 * @param pessoaDTO Objeto de transferência
	 * 
	 * @return Retorna objeto PessoaDTO com id salvo no banco
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 */
	private PessoaDTO salvar(PessoaDTO pessoaDTO)throws ClientProtocolException, IOException{
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();			
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);		
		headers.add("X-XSRF-TOKEN", token.getAuthenticationResponseDTO().getToken_csrf());
		headers.add("Cookie",token.getCookie());
		headers.add("Authorization", "Bearer "+token.getAuthenticationResponseDTO().getToken_jwt());
		MultiValueMap<String,Object> parameters = new LinkedMultiValueMap<String,Object>();
		parameters.add("files", null);
		parameters.add("pessoa", pessoaDTO);
				
		HttpEntity<MultiValueMap<String,Object>> entity =
		            new HttpEntity<MultiValueMap<String, Object>>(parameters, headers);
		PessoaDTO pessoaDTOResponse = restTemplate.postForObject(urlBase + "/api/pessoas", entity, PessoaDTO.class);
				
		return pessoaDTOResponse;
	}
	
	/**
	 * Método para criar o objeto EstadoCivilDTO da pessoa
	 * 
	 * @return Retorna objeto EstadoCivilDTO
	 */
	private EstadoCivilDTO criarEstadoCivilDTO(){
		EstadoCivilDTO estadoCivilDTO = new EstadoCivilDTO();
		estadoCivilDTO.setId(1L);
		return estadoCivilDTO;
	}
	
	/**
	 * Método para criar o objeto EscolaridadeDTO da pessoa
	 * 
	 * @return Retorna objeto EscolaridadeDTO
	 */
	private EscolaridadeDTO criarEscolaridadeDTO(){
		EscolaridadeDTO escolaridadeDTO = new EscolaridadeDTO();
		escolaridadeDTO.setId(3L);
		return escolaridadeDTO;
	}
	
	/**
	 * Método para criar o objeto SexoDTO da pessoa
	 * 
	 * @return Retorna objeto SexoDTO
	 */
	private SexoDTO criarSexoDTO(){
		SexoDTO sexoDTO = new SexoDTO();
		sexoDTO.setId(1L);
		return sexoDTO;
	}
	
	/**
	 * Método para criar o objeto EnderecoDTO da pessoa
	 * 
	 * @return Retorna objeto EnderecoDTO
	 */
	private List<EnderecoDTO> criarEnderecoDTO(){
		List<EnderecoDTO> listaEndereco = new ArrayList<>();
		EnderecoDTO enderecoDTO = new EnderecoDTO();
		enderecoDTO.setLogradouro("Qualquer");
		enderecoDTO.setBairro("qualquer");
		enderecoDTO.setNumero(1233);
		enderecoDTO.setComplemento(null);
		enderecoDTO.setCep("70000000");
		enderecoDTO.setMunicipio(criarMunicipioDTO());		
		enderecoDTO.setEstado(criarEstadoDTO());
		enderecoDTO.setPais(criarPaisDTO());
		listaEndereco.add(enderecoDTO);
		return listaEndereco;
	}
	
	/**
	 * Método para criar o objeto MunicipioDTO da pessoa
	 * 
	 * @return Retorna objeto MunicipioDTO
	 */
	private MunicipioDTO criarMunicipioDTO(){
		MunicipioDTO municipioDTO = new MunicipioDTO();
		municipioDTO.setEstadoId(1L);
		municipioDTO.setId(3L);
		return municipioDTO;
	}
	
	/**
	 * Método para criar o objeto EstadoDTO da pessoa
	 * 
	 * @return Retorna objeto EstadoDTO
	 */
	private EstadoDTO criarEstadoDTO(){
		EstadoDTO estadoDTO = new EstadoDTO();
		estadoDTO.setId(1L);
		return estadoDTO;
	}	
	
	/**
	 * Método para criar o objeto PaisDTO da pessoa
	 * 
	 * @return Retorna objeto PaisDTO
	 */
	private PaisDTO criarPaisDTO(){
		PaisDTO paisDTO = new PaisDTO();
		paisDTO.setId(1L);
		return paisDTO;
	}
	

	/**
	 * Método para criar o objeto StatusPessoaDTO da pessoa
	 * 
	 * @return Retorna objeto StatusPessoaDTO
	 */
	private StatusPessoaDTO criarStatusPessoaDTO(){
		StatusPessoaDTO statusPessoaDTO = new StatusPessoaDTO();
		statusPessoaDTO.setId(2L);
		return statusPessoaDTO;
	}	
}
