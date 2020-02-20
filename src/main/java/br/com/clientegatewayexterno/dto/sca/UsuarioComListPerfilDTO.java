package br.com.clientegatewayexterno.dto.sca;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the Usuario entity.
 */
public class UsuarioComListPerfilDTO implements Serializable {

    private static final long serialVersionUID = -6081719902764867765L;

    private Long id;

    @NotNull
    @Size(max = 80)
    private String nome;

    @Size(max = 64)
    private String login;

    @NotNull
    private Boolean ativo;

    private List<UsuarioPerfilSimplesDTO> perfis;

    // GETTERS & SETTERS

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<UsuarioPerfilSimplesDTO> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<UsuarioPerfilSimplesDTO> perfis) {
        this.perfis = perfis;
    }
}
