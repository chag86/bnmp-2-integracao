package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo OutrosNomesDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class OutrosNomesDTO implements Serializable {

    private Long id;

    private String nome;

    private Long idUsuario;

    private Long pessoaId;

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
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OutrosNomesDTO outrosNomesDTO = (OutrosNomesDTO) o;

        if ( ! Objects.equals(id, outrosNomesDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OutrosNomesDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", idUsuario='" + idUsuario + "'" +
            '}';
    }
}
