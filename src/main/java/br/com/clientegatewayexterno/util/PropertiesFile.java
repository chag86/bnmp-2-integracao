package br.com.clientegatewayexterno.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *Classe para ler o arquivo URL.properties
 */
public class PropertiesFile {

	 /**
	 * Método para retornar os valores do arquivo url.properties
	 * 
	 * @param param Nome do parâmetro que deseja obter o valor
	 * 
	 * @return Valores do arquivo url.properties
	 * 
	 * @throws IOException
	 */
	public static String getValor(String param) throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./src/main/resources/global.properties");
		props.load(file);
		return props.getProperty(param);
	}	
}
