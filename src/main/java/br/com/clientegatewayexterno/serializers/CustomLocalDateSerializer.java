package br.com.clientegatewayexterno.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import static java.time.format.DateTimeFormatter.ofPattern;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/** 
 * Classe pela Serialização de datas.
 */
public class CustomLocalDateSerializer extends JsonSerializer<LocalDate> {

	public static final DateTimeFormatter FORMATTER = ofPattern("dd/MM/yyyy");

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.format(FORMATTER));
    }
}
