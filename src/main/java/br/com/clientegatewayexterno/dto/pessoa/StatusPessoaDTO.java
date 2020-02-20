package br.com.clientegatewayexterno.dto.pessoa;


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/** 
 * Classe para objetos do tipo StatusPessoaDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class StatusPessoaDTO implements Serializable {

	private static final long serialVersionUID = -6494508997558638045L;

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

        StatusPessoaDTO statusPessoaDTO = (StatusPessoaDTO) o;

        if ( ! Objects.equals(id, statusPessoaDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StatusPessoaDTO{" +
            "id=" + id +
            ", descricao='" + descricao + "'" +
            '}';
    }
}
