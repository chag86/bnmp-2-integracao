package br.com.clientegatewayexterno.dto.sca;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang.StringUtils;

import br.com.clientegatewayexterno.util.CPFUtils;

/**
 * A DTO for the Usuario entity.
 */
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = -6081719902764867765L;

    private Long id;

    @NotNull
    @Size(max = 80)
    private String nome;

    private String login;

    @NotNull
    @Size(max = 80)
    private String senha;

    private ZonedDateTime dtRegistro;

    private ZonedDateTime dtExpiracao;

    private ZonedDateTime dtAtivacao;

    private ZonedDateTime dtUltimoAcesso;

    private Boolean excluido;

    @NotNull
    private Boolean ativo;

    private Boolean senhaExpira;

    @NotNull
    @Size(min = 1)
    private List<TelefoneUsuarioDTO> telefoneUsuario;

    @NotNull
    @Size(min = 1)
    private List<EmailUsuarioDTO> emailUsuario;

    @Size(max = 500)
    private String justificativa;

    @NotNull
    @Size(max = 11)
    private String cpf;

    @Size(max = 1)
    private String sexo;

    @NotNull
    private TipoUsuarioDTO tipoUsuario;

    private List<UsuarioPerfilDTO> usuarioPerfils;

    @NotNull
    private ZonedDateTime dataNascimento;

    @NotNull
    @Size(min = 1)
    private List<OrgaoDTO> orgaos;

    @NotNull
    @Size(max = 10)
    private String cep;

    @NotNull
    private UnidadeFederativaDTO estado;

    @NotNull
    private MunicipioDTO municipio;

    @NotNull
    @Size(max = 500)
    private String endereco;

    @NotNull
    @Size(max = 200)
    private String bairro;

    @Size(max = 100)
    private String complemento;

    public String getCpfFormatado() {
        return CPFUtils.formatar(this.cpf);
    }

    public String getListaEmailFormatada() {
        if (this.emailUsuario != null && !this.emailUsuario.isEmpty()) {
            List<String> lista = new ArrayList<>();
            this.emailUsuario.forEach(email -> lista.add(email.getEmail()));
            return StringUtils.join(lista, ", ");
        }
        return null;
    }

    public List<UsuarioPerfilDTO> getPerfisDelegados() {
        if (this.usuarioPerfils != null) {
            return this.usuarioPerfils.stream().filter(item -> item.getDtDelegacao() != null).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    public String getPerfisDelegadosFormatados() {
        List<UsuarioPerfilDTO> perfisDelegados = this.getPerfisDelegados();
        if (perfisDelegados != null && !perfisDelegados.isEmpty()) {
            List<String> lista = new ArrayList<>();
            perfisDelegados.forEach(item -> lista.add(item.getPerfilNome()));
            return StringUtils.join(lista, ", ");
        }
        return null;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ZonedDateTime getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(ZonedDateTime dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public ZonedDateTime getDtExpiracao() {
        return dtExpiracao;
    }

    public void setDtExpiracao(ZonedDateTime dtExpiracao) {
        this.dtExpiracao = dtExpiracao;
    }

    public ZonedDateTime getDtAtivacao() {
        return dtAtivacao;
    }

    public void setDtAtivacao(ZonedDateTime dtAtivacao) {
        this.dtAtivacao = dtAtivacao;
    }

    public ZonedDateTime getDtUltimoAcesso() {
        return dtUltimoAcesso;
    }

    public void setDtUltimoAcesso(ZonedDateTime dtUltimoAcesso) {
        this.dtUltimoAcesso = dtUltimoAcesso;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getSenhaExpira() {
        return senhaExpira;
    }

    public void setSenhaExpira(Boolean senhaExpira) {
        this.senhaExpira = senhaExpira;
    }

    public List<TelefoneUsuarioDTO> getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(List<TelefoneUsuarioDTO> telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoUsuarioDTO getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<UsuarioPerfilDTO> getUsuarioPerfils() {
        return usuarioPerfils;
    }

    public void setUsuarioPerfils(List<UsuarioPerfilDTO> usuarioPerfils) {
        this.usuarioPerfils = usuarioPerfils;
    }

    public ZonedDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(ZonedDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<EmailUsuarioDTO> getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(List<EmailUsuarioDTO> emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public List<OrgaoDTO> getOrgaos() {
        return orgaos;
    }

    public void setOrgaos(List<OrgaoDTO> orgaos) {
        this.orgaos = orgaos;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public UnidadeFederativaDTO getEstado() {
        return estado;
    }

    public void setEstado(UnidadeFederativaDTO estado) {
        this.estado = estado;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UsuarioDTO usuarioDTO = (UsuarioDTO) o;

        if (!Objects.equals(id, usuarioDTO.id)) {
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
        return "UsuarioDTO{" + "id=" + id + ", nome='" + nome + "'" + ", email='" + emailUsuario + "'" + ", login='" + login
            + "'" + ", senha='" + senha + "'" + ", dtRegistro='" + dtRegistro + "'" + ", dtExpiracao='"
            + dtExpiracao + "'" + ", dtAtivacao='" + dtAtivacao + "'" + ", dtUltimoAcesso='" + dtUltimoAcesso + "'"
            + ", excluido='" + excluido + "'" + ", telefoneUsuario='" + telefoneUsuario
            + "'" + ", justificativa='" + justificativa + "'" + ", cpf='" + cpf + "'" + '}';
    }
}
