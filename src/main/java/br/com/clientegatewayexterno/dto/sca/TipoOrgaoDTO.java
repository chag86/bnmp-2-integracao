package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TipoOrgao entity.
 */
public class TipoOrgaoDTO implements Serializable {

    private static final long serialVersionUID = -9205445680361709116L;

    private Long id;

    public static final String SIGLA_TRIBUNAL_SUPERIOR = "TRIBS";

    public static final String SIGLA_CONSELHO_NACIONAL_JUSTICA = "CNJ";

    @NotNull
    @Size(max = 80)
    private String nome;

    private EsferaDTO esfera;

    @NotNull
    @Size(max = 30)
    private String sigla;

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

    public EsferaDTO getEsfera() {
        return esfera;
    }

    public void setEsfera(EsferaDTO esfera) {
        this.esfera = esfera;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipoOrgaoDTO tipoOrgaoDTO = (TipoOrgaoDTO) o;

        if (!Objects.equals(id, tipoOrgaoDTO.id)) {
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
        return "TipoOrgaoDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
