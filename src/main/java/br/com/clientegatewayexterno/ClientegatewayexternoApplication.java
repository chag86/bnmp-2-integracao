package br.com.clientegatewayexterno;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.clientegatewayexterno.dto.pessoa.PessoaDTO;
import br.com.clientegatewayexterno.dto.token.Token;
import br.com.clientegatewayexterno.service.Autenticacao;
import br.com.clientegatewayexterno.service.MandadoPrisaoService;
import br.com.clientegatewayexterno.service.PessoaService;

/**
 * Classe que inicializa o projeto Spring Boot.<br>
 * 
 * Este projeto tem o intuito de apresentar o uso de serviços básicos da API do sistema BNMP.<br>
 * 
 * Os serviços consumidos são: salvar pessoa, salvar mandado de prisão. 
 */
@SpringBootApplication
public class ClientegatewayexternoApplication {

	
	/**
	 * Método de inicialização do Spring Boot
	 * 
	 * @param args parâmetro do main
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws ClientProtocolException, IOException, IllegalAccessException, InvocationTargetException{
		SpringApplication.run(ClientegatewayexternoApplication.class, args);
		
		Autenticacao autenticacao = new Autenticacao();
		Token token = autenticacao.autenticar();		
		PessoaDTO pessoaDTO = novaPessoa(token);					
		//novoMandadoPrisao(pessoaDTO,token);		
	}
	
	/**
	 * Método para criar uma nova pessoa
	 * 
	 * @param respDTO objeto de tranferência com os tokens de autenticação
	 * 
	 * @return PessoaDTO objeto de tranferência de dado.
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 */
	private static PessoaDTO novaPessoa(Token token)throws ClientProtocolException, IOException{		
		PessoaService pessoaService = new PessoaService(token);
		return pessoaService.criarPessoaDTO();
	}
	
	/**
	 * Método para criar um novo Mandado de Prisão
	 * 
	 * @param pessoaDTO objeto de tranferência de dado a ser salvar
	 * 
	 * @param respDTO objeto de tranferência com os tokens de autenticação
	 * 
	 * @throws ClientProtocolException
	 * 
	 * @throws IOException
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	private static void novoMandadoPrisao(PessoaDTO pessoaDTO,Token token)throws ClientProtocolException, IOException, IllegalAccessException, InvocationTargetException{
		MandadoPrisaoService mandadoPrisaoService = new MandadoPrisaoService(pessoaDTO,token);
		mandadoPrisaoService.criarMandadoPrisaoDTO();
	}
		
}