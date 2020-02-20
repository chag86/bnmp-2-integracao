package br.com.clientegatewayexterno.dto.pessoa;


import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/** 
 * Classe para objetos do tipo EstadoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class EstadoDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 40)
    private String nome;

    @NotNull
    @Size(max = 2)
    private String sigla;

    private Long paisId;

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
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Long getPaisId() {
        return paisId;
    }

    public void setPaisId(Long paisId) {
        this.paisId = paisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EstadoDTO estadoDTO = (EstadoDTO) o;

        if ( ! Objects.equals(id, estadoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EstadoDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", sigla='" + sigla + "'" +
            '}';
    }
}
