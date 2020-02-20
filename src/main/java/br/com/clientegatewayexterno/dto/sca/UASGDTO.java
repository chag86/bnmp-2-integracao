package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the UASG entity.
 */
public class UASGDTO implements Serializable {

    private static final long serialVersionUID = -7712103582907511303L;

    private Long codUasg;

    private String nome;

    private String mnemonico;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String complemento;

    private String cep;

    private Integer ddd;

    private String telefone;

    private String fax;

    private String ramal;

    private String telefone2;

    private String ramal2;

    private Integer ativo;

    private Long codOrgao;

    private MunicipioDTO municipio;

    public Long getCodUasg() {
        return codUasg;
    }

    public void setCodUasg(Long codUasg) {
        this.codUasg = codUasg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMnemonico() {
        return mnemonico;
    }

    public void setMnemonico(String mnemonico) {
        this.mnemonico = mnemonico;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getRamal2() {
        return ramal2;
    }

    public void setRamal2(String ramal2) {
        this.ramal2 = ramal2;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public Long getCodOrgao() {
        return codOrgao;
    }

    public void setCodOrgao(Long codOrgao) {
        this.codOrgao = codOrgao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UASGDTO uASGDTO = (UASGDTO) o;

        if (!Objects.equals(codUasg, uASGDTO.codUasg)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codUasg);
    }

    @Override
    public String toString() {
        return "UASGDTO{" +
            "id=" + codUasg +
            ", nome='" + nome + "'" +
            ", mnemonico='" + mnemonico + "'" +
            ", endereco='" + endereco + "'" +
            ", numero='" + numero + "'" +
            ", bairro='" + bairro + "'" +
            ", complemento='" + complemento + "'" +
            ", cep='" + cep + "'" +
            ", ddd='" + ddd + "'" +
            ", telefone='" + telefone + "'" +
            ", fax='" + fax + "'" +
            ", ramal='" + ramal + "'" +
            ", telefone2='" + telefone2 + "'" +
            ", ramal2='" + ramal2 + "'" +
            ", ativo='" + ativo + "'" +
            '}';
    }
}
