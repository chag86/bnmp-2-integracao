package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Perfil entity.
 */
public class PerfilDTO implements Serializable {

    private static final long serialVersionUID = -2997018835734233228L;

    private Long id;
    private String nome;
    private String descricao;
    private Boolean excluido;
    private Boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PerfilDTO other = (PerfilDTO) o;

        if (!Objects.equals(id, other.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PerfilDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", descricao='" + descricao + "'" +
            ", ativo='" + ativo + "'" +
            ", excluido='" + excluido + "'" +
            '}';
    }
}
