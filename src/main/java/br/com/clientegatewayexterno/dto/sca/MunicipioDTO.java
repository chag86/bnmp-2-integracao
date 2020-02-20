package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Municipio entity.
 */
public class MunicipioDTO implements Serializable {

    private static final long serialVersionUID = 7639938596514745153L;

    private Long id;

    @NotNull
    @Size(max = 80)
    private String nome;

    @NotNull
    private UnidadeFederativaDTO uf;

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

    public UnidadeFederativaDTO getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativaDTO uf) {
        this.uf = uf;
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

        if (!Objects.equals(id, municipioDTO.id)) {
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
        return "MunicipioDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
