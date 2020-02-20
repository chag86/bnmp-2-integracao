package br.com.clientegatewayexterno.dto.pessoa;


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/** 
 * Classe para objetos do tipo SexoDTO, onde serão contidos valores e métodos para o mesmo.
 */

public class SexoDTO implements Serializable {

	private static final long serialVersionUID = -1689646647076626213L;

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

        SexoDTO sexoDTO = (SexoDTO) o;

        if ( ! Objects.equals(id, sexoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SexoDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
