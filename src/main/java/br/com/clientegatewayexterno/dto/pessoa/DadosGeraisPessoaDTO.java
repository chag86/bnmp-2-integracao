package br.com.clientegatewayexterno.dto.pessoa;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;


/**
 * A DTO for the DadosGeraisPessoa entity.
 */
public class DadosGeraisPessoaDTO extends DadosGeraisComumDTO {

    private static final long serialVersionUID = 1L;

    @NotNull
    private Long idTribunal;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataNascimento;

    private String telefone;

    private String celular;

    @Size(max = 150)
    private String profissao;

    private NaturalidadeDTO natural;

    @Size(max = 150)
    private String email;

    @Size(max = 150)
    private String orientacaoSexual;

    private Boolean gravidez;

    private Boolean lactante;

    private Boolean deficienteFisico;

    private Boolean dependenteQuimico;

    private ZonedDateTime dataCriacao;

    private Boolean maisRecente;

    private PessoaDTO pessoa;

    private EscolaridadeDTO escolaridade;

    private EstadoCivilDTO estadoCivil;

    private CorRacaDTO corRaca;

    private NacionalidadeDTO nacionalidade;

    private String dataNascimentoToString;
    
    private EnderecoDTO endereco;

    public Long getIdTribunal() {
        return idTribunal;
    }

    public void setIdTribunal(Long idTribunal) {
        this.idTribunal = idTribunal;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public NaturalidadeDTO getNatural() {
        return natural;
    }

    public void setNatural(NaturalidadeDTO natural) {
        this.natural = natural;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public Boolean getGravidez() {
        return gravidez;
    }

    public void setGravidez(Boolean gravidez) {
        this.gravidez = gravidez;
    }

    public Boolean getLactante() {
        return lactante;
    }

    public void setLactante(Boolean lactante) {
        this.lactante = lactante;
    }

    public Boolean getDeficienteFisico() {
        return deficienteFisico;
    }

    public void setDeficienteFisico(Boolean deficienteFisico) {
        this.deficienteFisico = deficienteFisico;
    }

    public Boolean getDependenteQuimico() { return dependenteQuimico; }

    public void setDependenteQuimico(Boolean dependenteQuimico) { this.dependenteQuimico = dependenteQuimico; }

    public ZonedDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(ZonedDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getMaisRecente() {
        return maisRecente;
    }

    public void setMaisRecente(Boolean maisRecente) {
        this.maisRecente = maisRecente;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public EscolaridadeDTO getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(EscolaridadeDTO escolaridade) {
        this.escolaridade = escolaridade;
    }

    public EstadoCivilDTO getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilDTO estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public CorRacaDTO getCorRaca() {
        return corRaca;
    }

    public void setCorRaca(CorRacaDTO corRaca) {
        this.corRaca = corRaca;
    }

    public NacionalidadeDTO getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeDTO nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDataNascimentoToString() {
        return dataNascimentoToString;
    }

    public void setDataNascimentoToString(String dataNascimentoToString) {
        this.dataNascimentoToString = dataNascimentoToString;
    }
    
    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "DadosGeraisPessoaDTO{" + "id=" + getId() + ", idTribunal='" + idTribunal + "'" + ", nome='" + getNome()
            + "'" + ", alcunha='" + getAlcunha() + "'" + ", nomePai='" + getNomePai() + "'" + ", nomeMae='"
            + getNomeMae() + "'" + ", dataNascimento='" + dataNascimento + "'" + ", telefone='" + telefone + "'"
            + ", celular='" + celular + "'" + ", profissao='" + profissao + "'" + ", natural='" + natural + "'"
            + ", email='" + email + "'" + ", orientacaoSexual='" + orientacaoSexual + "'" + ", gravidez='" + gravidez
            + "'" + ", lactante='" + lactante + "'" + ", deficienteFisico='" + deficienteFisico + "'" + ", dependenteQuimico='" + dependenteQuimico + "'" + '}';
    }
}
