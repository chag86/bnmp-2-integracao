
package br.com.clientegatewayexterno.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.MaskFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ToStringUtil {

    private static final String de = " de ";

    private static final String virgula_espaco = ", ";

    private ToStringUtil() {}

    private static final Logger log = LoggerFactory.getLogger(ToStringUtil.class);

    public static String getHoraAssinatura(ZonedDateTime timeStamp) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(timeStamp) + " às "
            + DateTimeFormatter.ofPattern("hh:mm").format(timeStamp);
    }

    public static String montaLocalDatado(String nomeLocal, ZonedDateTime data) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nomeLocal);
        stringBuilder.append(virgula_espaco);
        stringBuilder.append(String.valueOf(data.getDayOfMonth()));
        stringBuilder.append(de);
        stringBuilder.append(String.valueOf(data.getMonth()));
        stringBuilder.append(de);
        stringBuilder.append(String.valueOf(data.getYear()));
        stringBuilder.append(".");

        return stringBuilder.toString();
    }

    public static String montaLocalDatadoSemData(ZonedDateTime data) {
        return String.valueOf(data.getDayOfMonth()) + de + montaMes(data.getMonthValue()) + de + String.valueOf(data.getYear()) + ".";
    }

    public static String montaMes(Integer mesInt) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"};
        if (mesInt != null && mesInt <= 12) {
            return meses[mesInt - 1];
        }
        return "";
    }

    public static String transformaLocalDateEmString(LocalDate date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return date.format(formatter);
        }
        return null;
    }
    
    public static String transformaZonedDateTimeEmString(ZonedDateTime date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return date.format(formatter);
        }
        return null;
    }

    public static String transformaLocalDateTimeEmString(LocalDateTime date) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return date.format(formatter);
        }
        return null;
    }

    public static String mascaraTelefone(String telefone) {
        MaskFormatter mf = null;
        if (telefone != null) {
            if (telefone.length() == 10) {
                try {
                    mf = new MaskFormatter("(##)####-####");
                } catch (ParseException e) {
                    log.debug(e.getMessage());
                }
            } else {
                try {
                    mf = new MaskFormatter("(##)#####-####");
                } catch (ParseException e) {
                    log.debug(e.getMessage());
                }
            }
            try {
                if (mf != null) {
                    mf.setValueContainsLiteralCharacters(false);
                    return mf.valueToString(telefone);
                }
            } catch (ParseException e) {
                log.debug(e.getMessage());
            }
        }
        return null;
    }

    public static String mascaraNumeroPeca(String numeroPeca) {
        if (numeroPeca != null) {
            try {
                MaskFormatter mf = new MaskFormatter("#######-##.####.#.##.####.##.####-##");
                mf.setValueContainsLiteralCharacters(false);
                return mf.valueToString(numeroPeca);
            } catch (ParseException e) {
                log.debug(e.getMessage());
            }
        }
        return null;
    }

    public static String mascaraNumeroProcesso(String numeroProcesso) {
        if (numeroProcesso != null) {
            try {
                MaskFormatter mf = new MaskFormatter("#######-##.####.#.##.####");
                mf.setValueContainsLiteralCharacters(false);
                return mf.valueToString(numeroProcesso);
            } catch (ParseException e) {
                log.debug(e.getMessage());
            }
        }
        return null;
    }

    public static String mascaraCep(String cep) {
        if (cep != null) {
            try {
                MaskFormatter mf = new MaskFormatter("##.###-###");
                mf.setValueContainsLiteralCharacters(false);
                return mf.valueToString(cep);
            } catch (ParseException e) {
                log.debug(e.getMessage());
            }
        }
        return null;
    }

    public static String mascaraRegistroJudiciarioIndividual(String rji) {
        if (rji != null) {
            try {
                MaskFormatter mf = new MaskFormatter("#########-##");
                mf.setValueContainsLiteralCharacters(false);
                return mf.valueToString(rji);
            } catch (ParseException e) {
                log.debug(e.getMessage());
            }
        }
        return null;
    }
}
