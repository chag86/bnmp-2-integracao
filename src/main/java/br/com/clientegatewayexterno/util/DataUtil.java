package br.com.clientegatewayexterno.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class DataUtil {
    public static String formatar(ZonedDateTime data) {
        return formatar(data, "dd/MM/yyyy HH:mm:ss");
    }

    public static String formatar(ZonedDateTime data, String formato) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofPattern(formato));
        }
        return null;
    }
}
