package br.com.clientegatewayexterno.dto.peca;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo TipoPecaDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class TipoPecaDTO implements Serializable {

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

        TipoPecaDTO tipoPecaDTO = (TipoPecaDTO) o;

        if ( ! Objects.equals(id, tipoPecaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TipoPecaDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
