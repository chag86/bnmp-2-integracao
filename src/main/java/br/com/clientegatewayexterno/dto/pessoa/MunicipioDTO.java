package br.com.clientegatewayexterno.dto.pessoa;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/** 
 * Classe para objetos do tipo MunicipioDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class MunicipioDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String nome;

    private Long estadoId;

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

    public Long getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Long estadoId) {
        this.estadoId = estadoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MunicipioDTO municipioDTO = (MunicipioDTO) o;

        if ( ! Objects.equals(id, municipioDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MunicipioDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
