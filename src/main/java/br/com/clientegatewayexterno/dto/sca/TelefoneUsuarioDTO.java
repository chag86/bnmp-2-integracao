package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TelefoneUsuario entity.
 */
public class TelefoneUsuarioDTO implements Serializable {

    private static final long serialVersionUID = -4824299427223334478L;

    private Long id;

    @NotNull
    @Size(max = 20)
    private String telefone;

    private Long usuarioId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TelefoneUsuarioDTO telefoneUsuarioDTO = (TelefoneUsuarioDTO) o;
        if (telefoneUsuarioDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), telefoneUsuarioDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TelefoneUsuarioDTO{" +
            "id=" + getId() +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }
}
