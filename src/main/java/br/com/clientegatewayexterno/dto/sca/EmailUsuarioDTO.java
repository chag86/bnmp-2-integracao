package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the EmailUsuario entity.
 */
public class EmailUsuarioDTO implements Serializable {

    private static final long serialVersionUID = -806237412795650079L;

    private Long id;

    private Long usuarioId;

    @NotNull
    @Size(max = 40)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

        EmailUsuarioDTO emailUsuarioDTO = (EmailUsuarioDTO) o;
        if (emailUsuarioDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), emailUsuarioDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmailUsuarioDTO{" +
            "id=" + getId() +
            ", usuario='" + getUsuarioId() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
