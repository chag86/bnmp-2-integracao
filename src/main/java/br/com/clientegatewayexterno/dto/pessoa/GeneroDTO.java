package br.com.clientegatewayexterno.dto.pessoa;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo GeneroDTO, onde serão contidos valores e métodos para o mesmo.
 */

public class GeneroDTO implements Serializable {

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

        GeneroDTO generoDTO = (GeneroDTO) o;

        if ( ! Objects.equals(id, generoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GeneroDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
