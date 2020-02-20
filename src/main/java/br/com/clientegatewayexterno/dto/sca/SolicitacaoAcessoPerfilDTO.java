package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the SolicitacaoAcessoPerfil entity.
 */
public class SolicitacaoAcessoPerfilDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long perfilId;

    private String perfilNome;

    private Long solicitacaoAcessoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SolicitacaoAcessoPerfilDTO solicitacaoAcessoPerfilDTO = (SolicitacaoAcessoPerfilDTO) o;

        if (!Objects.equals(id, solicitacaoAcessoPerfilDTO.id)) {
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
        return "SolicitacaoAcessoPerfilDTO{" +
            "id=" + id +
            '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Long perfilId) {
        this.perfilId = perfilId;
    }

    public Long getSolicitacaoAcessoId() {
        return solicitacaoAcessoId;
    }

    public void setSolicitacaoAcessoId(Long solicitacaoAcessoId) {
        this.solicitacaoAcessoId = solicitacaoAcessoId;
    }

    public String getPerfilNome() {
        return perfilNome;
    }

    public void setPerfilNome(String perfilNome) {
        this.perfilNome = perfilNome;
    }
}
