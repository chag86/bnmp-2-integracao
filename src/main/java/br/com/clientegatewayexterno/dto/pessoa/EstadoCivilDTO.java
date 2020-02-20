package br.com.clientegatewayexterno.dto.pessoa;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo EstadoCivilDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class EstadoCivilDTO implements Serializable {

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

        EstadoCivilDTO estadoCivilDTO = (EstadoCivilDTO) o;

        if ( ! Objects.equals(id, estadoCivilDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EstadoCivilDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
