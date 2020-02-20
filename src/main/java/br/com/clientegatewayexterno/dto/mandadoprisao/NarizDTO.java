package br.com.clientegatewayexterno.dto.mandadoprisao;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo NarizDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class NarizDTO implements Serializable {

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

        NarizDTO narizDTO = (NarizDTO) o;
        if(narizDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), narizDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "NarizDTO{" +
            "id=" + getId() +
            ", descricao='" + getDescricao() + "'" +
            "}";
    }
}
