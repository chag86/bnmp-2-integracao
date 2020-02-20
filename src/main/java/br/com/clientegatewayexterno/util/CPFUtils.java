package br.com.clientegatewayexterno.util;

import org.apache.commons.lang.StringUtils;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public final class CPFUtils {

    public static String formatar(String cpf) {
        if (StringUtils.isNotBlank(cpf)) {
            try {
                MaskFormatter mf = new MaskFormatter("###.###.###-##");
                mf.setValueContainsLiteralCharacters(false);
                return mf.valueToString(cpf);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
