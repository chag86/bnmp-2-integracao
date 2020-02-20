package br.com.clientegatewayexterno.dto.sca;

import org.apache.commons.lang.StringUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the Recurso entity.
 */
public class RecursoDTO implements Serializable {

    private static final long serialVersionUID = -2997018835734233228L;

    private Long id;

    @NotNull
    @Size(max = 80)
    private String nome;

    @NotNull
    @Size(max = 25)
    private String sigla;

    @NotNull
    @Size(max = 255)
    private String descricao;

    @NotNull
    private Boolean ativo;

    private ZonedDateTime dtAtivacao;

    private ZonedDateTime dtCadastro;

    @NotNull
    private Boolean excluido;

    private Boolean acessoExterno;

    @NotNull
    @Size(max = 20)
    private String codClientId;

    private Integer codPerfilGestor;

    @NotNull
    @Size(max = 255)
    private String caminho;

    @Size(max = 80)
    private String icone;

    private Boolean permiteExclusao;

    private List<RecursoTipoRecursoDTO> recursoTipoRecursos = new ArrayList<>();

    private Long idTipoRecurso;

    public String getListaTipoRecursosFormatada() {
        if (this.recursoTipoRecursos != null && !this.recursoTipoRecursos.isEmpty()) {
            List<String> lista = new ArrayList<>();
            this.recursoTipoRecursos.forEach(item -> lista.add(item.getTipoRecursoNome()));
            return StringUtils.join(lista, ", ");
        }
        return null;
    }

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public ZonedDateTime getDtAtivacao() {
        return dtAtivacao;
    }

    public void setDtAtivacao(ZonedDateTime dtAtivacao) {
        this.dtAtivacao = dtAtivacao;
    }

    public ZonedDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(ZonedDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public Boolean getAcessoExterno() {
        return acessoExterno;
    }

    public void setAcessoExterno(Boolean acessoExterno) {
        this.acessoExterno = acessoExterno;
    }

    public String getCodClientId() {
        return codClientId;
    }

    public void setCodClientId(String codClientId) {
        this.codClientId = codClientId;
    }

    public Integer getCodPerfilGestor() {
        return codPerfilGestor;
    }

    public void setCodPerfilGestor(Integer codPerfilGestor) {
        this.codPerfilGestor = codPerfilGestor;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Boolean getPermiteExclusao() {
        return permiteExclusao;
    }

    public void setPermiteExclusao(Boolean permiteExclusao) {
        this.permiteExclusao = permiteExclusao;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public List<RecursoTipoRecursoDTO> getRecursoTipoRecursos() {
        return recursoTipoRecursos;
    }

    public void setRecursoTipoRecursos(List<RecursoTipoRecursoDTO> recursoTipoRecursos) {
        this.recursoTipoRecursos = recursoTipoRecursos;
    }

    public Long getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(Long idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RecursoDTO recursoDTO = (RecursoDTO) o;

        if (!Objects.equals(id, recursoDTO.id)) {
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
        return "RecursoDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", sigla='" + sigla + "'" +
            ", descricao='" + descricao + "'" +
            ", ativo='" + ativo + "'" +
            ", dtAtivacao='" + dtAtivacao + "'" +
            ", dtCadastro='" + dtCadastro + "'" +
            ", excluido='" + excluido + "'" +
            ", acessoExterno='" + acessoExterno + "'" +
            ", codClientId='" + codClientId + "'" +
            ", codPerfilGestor='" + codPerfilGestor + "'" +
            ", caminho='" + caminho + "'" +
            ", permiteExclusao='" + permiteExclusao + "'" +
            '}';
    }
}
