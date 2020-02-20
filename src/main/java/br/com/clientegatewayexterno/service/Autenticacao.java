package br.com.clientegatewayexterno.service;

import java.io.IOException;
import java.util.Arrays;

import org.apache.http.client.ClientProtocolException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.clientegatewayexterno.dto.sca.AuthenticationRequestDTO;
import br.com.clientegatewayexterno.dto.sca.AuthenticationResponseDTO;
import br.com.clientegatewayexterno.dto.token.Token;
import br.com.clientegatewayexterno.util.PropertiesFile;

/**
 * Classe para a autenticação no servidor OAuth2.<br>
 * 
 * A classe é responsavel pela autenticação do usuário que deseja utilizar a API do bnmpServer.
 */
public class Autenticacao {	
	
	String urlBase;
	public Autenticacao() throws IOException{
		urlBase = PropertiesFile.getValor("urlAutenticar");
	}
			
	/**
	 * Método para autenticar o usuário.
	 * 
	 * Os dados usados para preencher o objeto AuthenticationRequestDTO são do ambiente de teste.
	 *  
	 * @return Retorna o objeto AuthenticationResponseDTO
	 * 
	 * @throws ClientProtocolException
	 *
	 * @throws IOException
	 */
	public Token autenticar()throws ClientProtocolException, IOException{
						
		RestTemplate restTemplate = new RestTemplate();		
		AuthenticationRequestDTO authenticationRequestDTO = new AuthenticationRequestDTO();
		authenticationRequestDTO.setClientId(PropertiesFile.getValor("clientid"));
		authenticationRequestDTO.setCodigoOrgao(PropertiesFile.getValor("codigoorgao"));
		authenticationRequestDTO.setUsername(PropertiesFile.getValor("username"));
		authenticationRequestDTO.setPassword(PropertiesFile.getValor("password"));								
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<AuthenticationRequestDTO> entity = new HttpEntity<>(authenticationRequestDTO,headers);	
		ResponseEntity<AuthenticationResponseDTO> authenticationResponseDTO = null;
		Token token = new Token();
		try{
			authenticationResponseDTO	= restTemplate.postForEntity(urlBase, entity, AuthenticationResponseDTO.class);
			if(authenticationResponseDTO.getBody() == null){
				token.setCookie(authenticationResponseDTO.getHeaders().get("Set-Cookie").get(0)+";"+authenticationResponseDTO.getHeaders().get("Set-Cookie").get(1));
				headers.add("Cookie",token.getCookie());
				entity = new HttpEntity<>(authenticationRequestDTO,headers);
				authenticationResponseDTO	= restTemplate.postForEntity(urlBase, entity, AuthenticationResponseDTO.class);
			}			
		}
		/**
		 * Este catch é necessário para recuperar o Cookie retornado na primeira chamada do serviço de
		 * autenticação.
		 * 
		 * Ao chamar o serviço de autenticação pela primeira vez ele lança uma exception HttpServerErrorException,
		 * a exception é capturada e obtido o cookie retornado no responseHeaders, é necessário inserir  
		 * o cookie no cabeçalho e chamar o  serviço novamente, assim ele não lança mais a exception.
		 */
		catch(HttpServerErrorException e){
			token.setCookie(e.getResponseHeaders().get("Set-Cookie").get(0));
			headers.add("Cookie",token.getCookie());
			entity = new HttpEntity<>(authenticationRequestDTO,headers);	
			authenticationResponseDTO = restTemplate.postForEntity(urlBase, entity, AuthenticationResponseDTO.class);
		}	
		
		token.setAuthenticationResponseDTO(authenticationResponseDTO.getBody());
		return token;		

	}	
}
