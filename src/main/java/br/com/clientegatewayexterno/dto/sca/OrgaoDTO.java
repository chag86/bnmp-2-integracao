package br.com.clientegatewayexterno.dto.sca;

import org.apache.commons.lang.BooleanUtils;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the Orgao entity.
 */
public class OrgaoDTO implements Serializable {

    private static final long serialVersionUID = -5459676157428798324L;

    private Long id;

    private Boolean externo;

    private String nome;

    private String telefone;

    private Boolean ativo;

    private ZonedDateTime dtCadastro;

    private TipoOrgaoDTO tipo;

    private MunicipioDTO municipio;

    private Long usuarioId;

    private Long orgaoPaiId;

    private String orgaoPaiNome;

    private OrgaoDTO orgaoTribunal;

    private List<OrgaoDTO> filhos;

    private AnexoDTO logomarca;

    private String cep;

    private String endereco;

    private String bairro;

    private String complemento;

    public String getAtivoFormatado() {
        return BooleanUtils.isTrue(this.ativo) ? "Sim" : "Não";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getExterno() {
        return externo;
    }

    public void setExterno(Boolean externo) {
        this.externo = externo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public ZonedDateTime getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(ZonedDateTime dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public TipoOrgaoDTO getTipo() {
        return tipo;
    }

    public void setTipo(TipoOrgaoDTO tipo) {
        this.tipo = tipo;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public Long getOrgaoPaiId() {
        return orgaoPaiId;
    }

    public String getOrgaoPaiNome() {
        return orgaoPaiNome;
    }

    public void setOrgaoPaiNome(String orgaoPaiNome) {
        this.orgaoPaiNome = orgaoPaiNome;
    }

    public void setOrgaoPaiId(Long orgaoPaiId) {
        this.orgaoPaiId = orgaoPaiId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public OrgaoDTO getOrgaoTribunal() {
        return orgaoTribunal;
    }

    public void setOrgaoTribunal(OrgaoDTO orgaoTribunal) {
        this.orgaoTribunal = orgaoTribunal;
    }

    public List<OrgaoDTO> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<OrgaoDTO> filhos) {
        this.filhos = filhos;
    }

    public AnexoDTO getLogomarca() {
        return logomarca;
    }

    public void setLogomarca(AnexoDTO logomarca) {
        this.logomarca = logomarca;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OrgaoDTO orgaoDTO = (OrgaoDTO) o;

        if (!Objects.equals(id, orgaoDTO.id)) {
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
        return "OrgaoDTO{" +
            "id=" + id +
            ", externo='" + externo + "'" +
            ", nome='" + nome + "'" +
            ", complemento='" + complemento + "'" +
            ", telefone='" + telefone + "'" +
            ", ativo='" + ativo + "'" +
            ", dtCadastro='" + dtCadastro + "'" +
            '}';
    }
}
