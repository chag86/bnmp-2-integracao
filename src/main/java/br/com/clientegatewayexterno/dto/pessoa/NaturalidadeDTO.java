package br.com.clientegatewayexterno.dto.pessoa;

/**
 * A DTO for the Naturalidade entity.
 */
public class NaturalidadeDTO extends CampoDominioDTO {

    private String uf;

    private Long codIbge;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(Long codIbge) {
        this.codIbge = codIbge;
    }
}
