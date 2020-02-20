package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.util.Objects;

import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.pessoa.CampoDominioDTO;

public class TipificacaoPenalDTO extends CampoDominioDTO {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String rotulo;

    private NoTipificacaoPenalDTO lei;

    private PecaDTO peca;

    public void setLei(NoTipificacaoPenalDTO lei) {
        this.lei = lei;
    }

    public NoTipificacaoPenalDTO getLei() {
        return lei;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPeca(PecaDTO peca) {
        this.peca = peca;
    }

    public PecaDTO getPeca() {
        return peca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        TipificacaoPenalDTO tipificacaoPenalDTO = (TipificacaoPenalDTO) o;
        if (tipificacaoPenalDTO.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, tipificacaoPenalDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
    
}
