package br.com.clientegatewayexterno.dto.pessoa;


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/** 
 * Classe para objetos do tipo CorRacaDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class CorRacaDTO implements Serializable {

	private static final long serialVersionUID = -3438099876407854613L;

	private Long id;

    @NotNull
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CorRacaDTO corRacaDTO = (CorRacaDTO) o;

        if ( ! Objects.equals(id, corRacaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CorRacaDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
