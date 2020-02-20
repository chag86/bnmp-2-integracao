package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * A DTO for the UsuarioPerfil entity.
 */
public class UsuarioPerfilSimplesDTO implements Serializable {

    private static final long serialVersionUID = -3986909596172453084L;

    private Long id;

    private Long perfilId;

    private String perfilNome;

    private ZonedDateTime dtDelegacao;

    private ZonedDateTime dtExpiracao;

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

    public String getPerfilNome() {
        return perfilNome;
    }

    public void setPerfilNome(String perfilNome) {
        this.perfilNome = perfilNome;
    }

    public ZonedDateTime getDtDelegacao() {
        return dtDelegacao;
    }

    public void setDtDelegacao(ZonedDateTime dtDelegacao) {
        this.dtDelegacao = dtDelegacao;
    }

    public ZonedDateTime getDtExpiracao() {
        return dtExpiracao;
    }

    public void setDtExpiracao(ZonedDateTime dtExpiracao) {
        this.dtExpiracao = dtExpiracao;
    }
}
