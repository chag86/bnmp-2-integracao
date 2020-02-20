package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo TipificacaoPenalMandadoPrisaoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class TipificacaoPenalMandadoPrisaoDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private TipificacaoPenalDTO tipificacaoPenal;

    private MandadoPrisaoDTO mandadoPrisao;

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

    public MandadoPrisaoDTO getMandadoPrisao() {
        return mandadoPrisao;
    }

    public void setMandadoPrisao(MandadoPrisaoDTO mandadoPrisao) {
        this.mandadoPrisao = mandadoPrisao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipificacaoPenalMandadoPrisaoDTO tipificacaoPenalMandadoPrisaoDTO = (TipificacaoPenalMandadoPrisaoDTO) o;
        if(tipificacaoPenalMandadoPrisaoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tipificacaoPenalMandadoPrisaoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TipificacaoPenalMandadoPrisaoDTO{" +
            "id=" + getId() +
            "}";
    }
}
