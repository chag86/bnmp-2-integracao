package br.com.clientegatewayexterno.dto.guiarecolhimento;


import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo PenaPecuniariaDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class PenaPecuniariaDTO implements Serializable {

	private static final long serialVersionUID = 4218872815308660241L;

	private Long id;

    private Integer diasMulta;

    private Double valorMulta;

    private GuiaRecolhimentoDTO guiaRecolhimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getDiasMulta() {
        return diasMulta;
    }

    public void setDiasMulta(Integer diasMulta) {
        this.diasMulta = diasMulta;
    }
    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
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

        PenaPecuniariaDTO penaPecuniariaDTO = (PenaPecuniariaDTO) o;

        if ( ! Objects.equals(id, penaPecuniariaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PenaPecuniariaDTO{" +
            "id=" + id +
            ", diasMulta='" + diasMulta + "'" +
            ", valorMulta='" + valorMulta + "'" +
            '}';
    }
}
