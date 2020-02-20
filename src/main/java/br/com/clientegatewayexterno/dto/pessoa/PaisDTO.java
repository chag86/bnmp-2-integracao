package br.com.clientegatewayexterno.dto.pessoa;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo PaisDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class PaisDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 50)
    private String nome;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PaisDTO paisDTO = (PaisDTO) o;

        if ( ! Objects.equals(id, paisDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PaisDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
