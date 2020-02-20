package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the RecursoTipoRecurso entity.
 */
public class RecursoTipoRecursoDTO implements Serializable {

    private static final long serialVersionUID = 4120423250125618377L;

    private Long id;

    private Long recursoId;

    private Long tipoRecursoId;

    private String tipoRecursoNome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecursoId() {
        return recursoId;
    }

    public void setRecursoId(Long recursoId) {
        this.recursoId = recursoId;
    }

    public Long getTipoRecursoId() {
        return tipoRecursoId;
    }

    public void setTipoRecursoId(Long tipoRecursoId) {
        this.tipoRecursoId = tipoRecursoId;
    }

    public String getTipoRecursoNome() {
        return tipoRecursoNome;
    }

    public void setTipoRecursoNome(String tipoRecursoNome) {
        this.tipoRecursoNome = tipoRecursoNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RecursoTipoRecursoDTO recursoTipoRecursoDTO = (RecursoTipoRecursoDTO) o;
        if (recursoTipoRecursoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), recursoTipoRecursoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RecursoTipoRecursoDTO{" +
            "id=" + getId() +
            "}";
    }
}
