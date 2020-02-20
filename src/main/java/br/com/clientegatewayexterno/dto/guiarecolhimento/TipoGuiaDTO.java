package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo TipificacaoPenalGuiaRecolhimentoDTO onde serão contidos, valores e métodos para o mesmo.
 */
public class TipoGuiaDTO implements Serializable {

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

        TipoGuiaDTO tipoGuiaDTO = (TipoGuiaDTO) o;

        if ( ! Objects.equals(id, tipoGuiaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TipoGuiaDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
