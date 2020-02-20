package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TipoUsuario entity.
 */
public class TipoUsuarioDTO implements Serializable {

    private static final long serialVersionUID = 6072637405953352359L;

    public static final long TIPO_USUARIO_INTERNO = 1;

    public static final long TIPO_USUARIO_EXTERNO = 2;

    public static final String EXTERNO = "Externo";

    public static final String INTERNO = "Interno";

    private Long id;

    @NotNull
    @Size(max = 50)
    private String nome;

    @NotNull
    @Size(max = 32)
    private String sigla;

    public TipoUsuarioDTO() {
    }

    public TipoUsuarioDTO(Long id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipoUsuarioDTO tipoUsuarioDTO = (TipoUsuarioDTO) o;

        if (!Objects.equals(id, tipoUsuarioDTO.id)) {
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
        return "TipoUsuarioDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", sigla='" + sigla + "'" +
            '}';
    }
}
