package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo TipoPenaDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class TipoPenaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

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

        TipoPenaDTO tipoPenaDTO = (TipoPenaDTO) o;

        if ( ! Objects.equals(id, tipoPenaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TipoPenaDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
