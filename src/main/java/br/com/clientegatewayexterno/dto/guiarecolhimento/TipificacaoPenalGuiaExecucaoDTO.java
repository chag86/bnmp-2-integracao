package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.Objects;

import br.com.clientegatewayexterno.dto.mandadoprisao.TipificacaoPenalDTO;

/** 
 * Classe para objetos do tipo TipificacaoPenalGuiaExecucaoDTO onde serão contidos, valores e métodos para o mesmo.
 */
public class TipificacaoPenalGuiaExecucaoDTO implements Serializable {

    private Long id;

    private TipificacaoPenalDTO tipificacaoPenal;

    private GuiaExecucaoDTO guiaExecucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipificacaoPenalDTO getTipificacaoPenal() {
        return tipificacaoPenal;
    }

    public void setTipificacaoPenal(TipificacaoPenalDTO tipificacaoPenal) {
        this.tipificacaoPenal = tipificacaoPenal;
    }

    public GuiaExecucaoDTO getGuiaExecucao() {
        return guiaExecucao;
    }

    public void setGuiaExecucao(GuiaExecucaoDTO guiaExecucao) {
        this.guiaExecucao = guiaExecucao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipificacaoPenalGuiaExecucaoDTO tipificacaoPenalGuiaExecucaoDTO = (TipificacaoPenalGuiaExecucaoDTO) o;
        if(tipificacaoPenalGuiaExecucaoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tipificacaoPenalGuiaExecucaoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TipificacaoPenalGuiaExecucaoDTO{" +
            "id=" + getId() +
            "}";
    }
}
