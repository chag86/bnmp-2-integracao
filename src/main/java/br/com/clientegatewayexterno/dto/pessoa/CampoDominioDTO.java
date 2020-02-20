package br.com.clientegatewayexterno.dto.pessoa;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by jonathan on 10/07/17.
 */
public class CampoDominioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CampoDominioDTO campoDominio = (CampoDominioDTO) o;
        if (campoDominio.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, campoDominio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
