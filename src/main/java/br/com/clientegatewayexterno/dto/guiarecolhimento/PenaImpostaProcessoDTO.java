package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo PenaImpostaProcessoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class PenaImpostaProcessoDTO implements Serializable {

	private static final long serialVersionUID = -7366175500068616679L;

	private Long id;

    private Integer ano;

    private Integer mes;

    private Integer dia;

    private GuiaRecolhimentoDTO guiaRecolhimento;

    private TipoPenaDTO tipoPena;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
    
    public GuiaRecolhimentoDTO getGuiaRecolhimento() {
		return guiaRecolhimento;
	}

	public void setGuiaRecolhimento(GuiaRecolhimentoDTO guiaRecolhimento) {
		this.guiaRecolhimento = guiaRecolhimento;
	}

	public TipoPenaDTO getTipoPena() {
		return tipoPena;
	}

	public void setTipoPena(TipoPenaDTO tipoPena) {
		this.tipoPena = tipoPena;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PenaImpostaProcessoDTO penaImpostaProcessoDTO = (PenaImpostaProcessoDTO) o;

        if ( ! Objects.equals(id, penaImpostaProcessoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PenaImpostaProcessoDTO{" +
            "id=" + id +
            ", ano='" + ano + "'" +
            ", mes='" + mes + "'" +
            ", dia='" + dia + "'" +
            '}';
    }
}
