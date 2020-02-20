package br.com.clientegatewayexterno.dto.sca;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * A DTO for the UsuarioPerfil entity.
 */
public class UsuarioPerfilDTO implements Serializable {

    private static final long serialVersionUID = -3986909596172453084L;

    private Long id;

    private ZonedDateTime dtCadastro;

    private ZonedDateTime dtExpiracao;

    private ZonedDateTime dtDelegacao;

    private Long usuarioId;

    private String usuarioNome;

    private String usuarioLogin;

    private Long usuarioDeleganteId;

    private String usuarioDeleganteNome;

    private UsuarioComListPerfilDTO usuarioComListPerfis;

    @NotNull
    private Long perfilId;

    private String perfilNome;

    // GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(ZonedDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public ZonedDateTime getDtExpiracao() {
        return dtExpiracao;
    }

    public void setDtExpiracao(ZonedDateTime dtExpiracao) {
        this.dtExpiracao = dtExpiracao;
    }

    public ZonedDateTime getDtDelegacao() {
        return dtDelegacao;
    }

    public void setDtDelegacao(ZonedDateTime dtDelegacao) {
        this.dtDelegacao = dtDelegacao;
    }

    public UsuarioComListPerfilDTO getUsuarioComListPerfis() {
        return usuarioComListPerfis;
    }

    public void setUsuarioComListPerfis(UsuarioComListPerfilDTO usuarioComListPerfis) {
        this.usuarioComListPerfis = usuarioComListPerfis;
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

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public Long getUsuarioDeleganteId() {
        return usuarioDeleganteId;
    }

    public void setUsuarioDeleganteId(Long usuarioDeleganteId) {
        this.usuarioDeleganteId = usuarioDeleganteId;
    }

    public String getUsuarioDeleganteNome() {
        return usuarioDeleganteNome;
    }

    public void setUsuarioDeleganteNome(String usuarioDeleganteNome) {
        this.usuarioDeleganteNome = usuarioDeleganteNome;
    }
}
