package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the Pendencia entity.
 */
public class PendenciaDTO implements Serializable {

    private static final long serialVersionUID = 7599623534033666012L;

    private Long id;

    @NotNull
    private TipoPendenciaDTO tipoPendencia;

    @NotNull
    private ZonedDateTime dtPendencia;

    @NotNull
    @Size(max = 1)
    private String pendencia;

    private RecursoDTO recurso;

    private UsuarioDTO usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPendenciaDTO getTipoPendencia() {
        return tipoPendencia;
    }

    public void setTipoPendencia(TipoPendenciaDTO tipoPendencia) {
        this.tipoPendencia = tipoPendencia;
    }

    public ZonedDateTime getDtPendencia() {
        return dtPendencia;
    }

    public void setDtPendencia(ZonedDateTime dtPendencia) {
        this.dtPendencia = dtPendencia;
    }

    public String getPendencia() {
        return pendencia;
    }

    public void setPendencia(String pendencia) {
        this.pendencia = pendencia;
    }

    public RecursoDTO getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoDTO recurso) {
        this.recurso = recurso;
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

        PendenciaDTO pendenciaDTO = (PendenciaDTO) o;

        if (!Objects.equals(id, pendenciaDTO.id)) {
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
        return "PendenciaDTO{" +
            "id=" + id +
            ", tipoPendencia='" + tipoPendencia + "'" +
            ", dtPendencia='" + dtPendencia + "'" +
            ", pendencia='" + pendencia + "'" +
            '}';
    }
}
