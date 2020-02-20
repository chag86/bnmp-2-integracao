package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import br.com.clientegatewayexterno.dto.sca.UsuarioDTO;

/** 
 * Classe para objetos do tipo AssinaturaDigitalDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class AssinaturaDigitalDTO implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    private ZonedDateTime timeStamp;

    @NotNull
    private Long idUsuario;

    @NotNull
    private String hash;

    private String horaAssinatura;

    private UsuarioDTO usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHoraAssinatura() {
        return horaAssinatura;
    }

    public void setHoraAssinatura(String horaAssinatura) {
        this.horaAssinatura = horaAssinatura;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssinaturaDigitalDTO assinaturaDigitalDTO = (AssinaturaDigitalDTO) o;

        if ( ! Objects.equals(id, assinaturaDigitalDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "AssinaturaDigitalDTO{" +
            "id=" + id +
            ", timeStamp='" + timeStamp + "'" +
            ", idUsuario='" + idUsuario + "'" +
            ", hash='" + hash + "'" +
            '}';
    }
}
