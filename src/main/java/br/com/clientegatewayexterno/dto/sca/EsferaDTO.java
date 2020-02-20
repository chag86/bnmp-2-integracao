package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Esfera entity.
 */
public class EsferaDTO implements Serializable {

    private static final long serialVersionUID = 4109851188617014932L;

    private Long id;

    @NotNull
    @Size(max = 80)
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

        EsferaDTO esferaDTO = (EsferaDTO) o;

        if (!Objects.equals(id, esferaDTO.id)) {
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
        return "EsferaDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
