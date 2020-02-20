package br.com.clientegatewayexterno.dto.mandadoprisao;

import br.com.clientegatewayexterno.dto.pessoa.CampoDominioDTO;

public class TipoNoTipificacaoPenalDTO extends CampoDominioDTO {

    private static final long serialVersionUID = -3418297691327983008L;

    private String simboloAntes;

    private String simboloDepois;

    private String regex;

    private String mensagemExemplo;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public void setSimboloAntes(String simboloAntes) {
        this.simboloAntes = simboloAntes;
    }

    public String getSimboloAntes() {
        return simboloAntes;
    }

    public String getSimboloDepois() {
        return simboloDepois;
    }

    public void setSimboloDepois(String simboloDepois) {
        this.simboloDepois = simboloDepois;
    }

    public String getMensagemExemplo() {
        return mensagemExemplo;
    }

    public void setMensagemExemplo(String mensagemExemplo) {
        this.mensagemExemplo = mensagemExemplo;
    }
}
