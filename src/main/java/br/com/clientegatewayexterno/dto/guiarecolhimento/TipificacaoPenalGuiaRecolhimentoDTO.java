package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.Objects;

import br.com.clientegatewayexterno.dto.mandadoprisao.TipificacaoPenalDTO;

/** 
 * Classe para objetos do tipo TipificacaoPenalGuiaRecolhimentoDTO onde serão contidos, valores e métodos para o mesmo.
 */
public class TipificacaoPenalGuiaRecolhimentoDTO implements Serializable {

	private static final long serialVersionUID = 2192550291801020331L;

	private Long id;

    private TipificacaoPenalDTO tipificacaoPenal;

    private GuiaRecolhimentoDTO guiaRecolhimento;

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

	public GuiaRecolhimentoDTO getGuiaRecolhimento() {
		return guiaRecolhimento;
	}

	public void setGuiaRecolhimento(GuiaRecolhimentoDTO guiaRecolhimento) {
		this.guiaRecolhimento = guiaRecolhimento;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipificacaoPenalGuiaRecolhimentoDTO tipificacaoPenalGuiaRecolhimentoDTO = (TipificacaoPenalGuiaRecolhimentoDTO) o;
        if(tipificacaoPenalGuiaRecolhimentoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tipificacaoPenalGuiaRecolhimentoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TipificacaoPenalGuiaRecolhimentoDTO{" +
            "id=" + getId() +
            "}";
    }
}
