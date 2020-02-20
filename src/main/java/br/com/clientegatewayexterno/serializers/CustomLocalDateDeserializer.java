package br.com.clientegatewayexterno.serializers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import static java.time.format.DateTimeFormatter.ofPattern;

/** 
 * Classe pela Deserialização de datas.
 */
public class CustomLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	public static final DateTimeFormatter FORMATTER = ofPattern("dd/MM/yyyy");

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

    	LocalDate localDate = null;

    	if(p.getValueAsString().contains("T"))
    		localDate = LocalDate.parse(p.getValueAsString().split("T")[0]);
    	else
    		localDate = LocalDate.parse(p.getValueAsString(), FORMATTER);

    	return localDate;
    }
}
