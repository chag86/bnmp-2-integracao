package br.com.clientegatewayexterno.dto.peca;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.dto.mandadoprisao.AssinaturaDigitalDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.OutrasPecasDTO;
import br.com.clientegatewayexterno.dto.pessoa.PessoaSemPecasDTO;
import br.com.clientegatewayexterno.dto.pessoa.StatusDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.dto.sca.UsuarioDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;
import br.com.clientegatewayexterno.util.ToStringUtil;

/**
 * A DTO for the Peca entity.
 */
public class PecaDTO implements Serializable {

    private static final long serialVersionUID = -1884592954248272837L;

    private Long id;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    @NotNull
    private LocalDate dataExpedicao;

    private ZonedDateTime dataCriacao;

    @NotNull
    private String numeroProcesso;

    private String numeroPeca;

    private TipoPecaDTO tipoPeca;

    private PessoaSemPecasDTO pessoa;

    private StatusDTO status;

    private List<OutrasPecasDTO> outrasPecas = new ArrayList<OutrasPecasDTO>();

    @Size(max = 150)
    private String nomeServidor;

    @Size(max = 150)
    private String cargoServidor;

    @Size(max = 150)
    private String magistrado;

    private Boolean assinarDigitalmenteServidor;

    private Boolean assinarDigitalmenteMagistrado;

    private String localDatado;

    private OrgaoDTO orgao;

    private AssinaturaDigitalDTO assinaturaServidor;

    private AssinaturaDigitalDTO assinaturaMagistrado;

    private UsuarioDTO usuarioCriador;

    private OrgaoDTO orgaoUsuarioCriador;

    private OrgaoDTO orgaoJudiciario;

    private OrgaoDTO orgaoOrigem;

    private String dataExpedicaoToString;

    private String dataCriacaoToString;

    private OrgaoDTO orgaoGuiaInternacao;

    private String justificativaCancelamento;

    private String mensagemRetornoConclusao;

    public String getNumeroPecaFormatado() {
        return ToStringUtil.mascaraNumeroPeca(this.numeroPeca);
    }

    public String getDataCriacaoFormatada() {
        return ToStringUtil.transformaZonedDateTimeEmString(this.dataCriacao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDate dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public ZonedDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(ZonedDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public TipoPecaDTO getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(TipoPecaDTO tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public PessoaSemPecasDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaSemPecasDTO pessoa) {
        this.pessoa = pessoa;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    public List<OutrasPecasDTO> getOutrasPecas() {
        return outrasPecas;
    }

    public void setOutrasPecas(List<OutrasPecasDTO> outrasPecas) {
        this.outrasPecas = outrasPecas;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getCargoServidor() {
        return cargoServidor;
    }

    public void setCargoServidor(String cargoServidor) {
        this.cargoServidor = cargoServidor;
    }

    public String getMagistrado() {
        return magistrado;
    }

    public void setMagistrado(String magistrado) {
        this.magistrado = magistrado;
    }

    public Boolean getAssinarDigitalmenteServidor() {
        return assinarDigitalmenteServidor;
    }

    public void setAssinarDigitalmenteServidor(Boolean assinarDigitalmenteServidor) {
        this.assinarDigitalmenteServidor = assinarDigitalmenteServidor;
    }

    public Boolean getAssinarDigitalmenteMagistrado() {
        return assinarDigitalmenteMagistrado;
    }

    public void setAssinarDigitalmenteMagistrado(Boolean assinarDigitalmenteMagistrado) {
        this.assinarDigitalmenteMagistrado = assinarDigitalmenteMagistrado;
    }

    public OrgaoDTO getOrgao() {
        return orgao;
    }

    public void setOrgao(OrgaoDTO orgao) {
        this.orgao = orgao;
    }

    public String getLocalDatado() {
        return localDatado;
    }

    public void setLocalDatado(String localDatado) {
        this.localDatado = localDatado;
    }

    public AssinaturaDigitalDTO getAssinaturaServidor() {
        return assinaturaServidor;
    }

    public void setAssinaturaServidor(AssinaturaDigitalDTO assinaturaServidor) {
        this.assinaturaServidor = assinaturaServidor;
    }

    public AssinaturaDigitalDTO getAssinaturaMagistrado() {
        return assinaturaMagistrado;
    }

    public void setAssinaturaMagistrado(AssinaturaDigitalDTO assinaturaMagistrado) {
        this.assinaturaMagistrado = assinaturaMagistrado;
    }

    public UsuarioDTO getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(UsuarioDTO usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }

    public OrgaoDTO getOrgaoUsuarioCriador() {
        return orgaoUsuarioCriador;
    }

    public void setOrgaoUsuarioCriador(OrgaoDTO orgaoUsuarioCriador) {
        this.orgaoUsuarioCriador = orgaoUsuarioCriador;
    }

    public OrgaoDTO getOrgaoJudiciario() {
        return orgaoJudiciario;
    }

    public void setOrgaoJudiciario(OrgaoDTO orgaoJudiciario) {
        this.orgaoJudiciario = orgaoJudiciario;
    }

    public OrgaoDTO getOrgaoOrigem() {
        return orgaoOrigem;
    }

    public void setOrgaoOrigem(OrgaoDTO orgaoOrigem) {
        this.orgaoOrigem = orgaoOrigem;
    }

    public String getDataExpedicaoToString() {
        return dataExpedicaoToString;
    }

    public void setDataExpedicaoToString(String dataExpedicaoToString) {
        this.dataExpedicaoToString = dataExpedicaoToString;
    }

    public String getDataCriacaoToString() {
        return dataCriacaoToString;
    }

    public void setDataCriacaoToString(String dataCriacaoToString) {
        this.dataCriacaoToString = dataCriacaoToString;
    }

    public OrgaoDTO getOrgaoGuiaInternacao() {
        return orgaoGuiaInternacao;
    }

    public void setOrgaoGuiaInternacao(OrgaoDTO orgaoGuiaInternacao) {
        this.orgaoGuiaInternacao = orgaoGuiaInternacao;
    }

    public String getJustificativaCancelamento() {
        return justificativaCancelamento;
    }

    public void setJustificativaCancelamento(String justificativaCancelamento) {
        this.justificativaCancelamento = justificativaCancelamento;
    }

    public String getMensagemRetornoConclusao() {
        return mensagemRetornoConclusao;
    }

    public void setMensagemRetornoConclusao(String mensagemRetornoConclusao) {
        this.mensagemRetornoConclusao = mensagemRetornoConclusao;
    }

    public void mascaraCamposPeca() {
        this.setNumeroProcesso(ToStringUtil.mascaraNumeroProcesso(this.getNumeroProcesso()));
        this.setNumeroPeca(ToStringUtil.mascaraNumeroPeca(this.getNumeroPeca()));
        this.setDataCriacaoToString(ToStringUtil.transformaZonedDateTimeEmString(this.getDataCriacao()));
        this.setDataExpedicaoToString(ToStringUtil.transformaLocalDateEmString(this.getDataExpedicao()));

        /*if (this.getPessoa() != null) {
            if (this.getPessoa().getDadosGeraisPessoa() != null) {
                this.getPessoa().getDadosGeraisPessoa().setTelefone(ToStringUtil.mascaraTelefone(this.getPessoa().getDadosGeraisPessoa().getTelefone()));
                this.getPessoa().getDadosGeraisPessoa().setCelular(ToStringUtil.mascaraTelefone(this.getPessoa().getDadosGeraisPessoa().getCelular()));
                this.getPessoa().getDadosGeraisPessoa().setDataNascimentoToString(ToStringUtil.transformaLocalDateEmString(this.getPessoa().getDadosGeraisPessoa().getDataNascimento()));
            }
            if (!CollectionUtils.isEmpty(this.getPessoa().getEnderecos())) {
                this.getPessoa().getEnderecos().forEach(endereco -> endereco.setCep(ToStringUtil.mascaraCep(endereco.getCep())));
            }
        }
        if (this.getOrgao() != null) {
            this.getOrgao().setTelefone(ToStringUtil.mascaraTelefone(this.getOrgao().getTelefone()));
        }
        if (!CollectionUtils.isEmpty(this.getOutrasPecas())) {
            mascaraCamposOutrasPecas();
        }*/
    }

    public String mascaraApenasNumeroPeca(){
        if(this.getNumeroPeca() != null){
            return ToStringUtil.mascaraNumeroPeca(this.getNumeroPeca());
        }
        return "";
    }

    private void mascaraCamposOutrasPecas() {
        /*if (this.getOutrasPecas() == null){
            return;
        }
        this.getOutrasPecas().forEach(outrasPecas -> {
            outrasPecas.getPeca().setNumeroPeca(ToStringUtil.mascaraNumeroPeca(outrasPecas.getPeca().getNumeroPeca()));
            outrasPecas.getPeca().setDataCriacaoToString(ToStringUtil.transformaZonedDateTimeEmString(outrasPecas.getPeca().getDataCriacao()));
        });*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PecaDTO pecaDTO = (PecaDTO) o;
        if (pecaDTO.id == null || this.id == null) {
            return false;
        }
        return Objects.equals(this.id, pecaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PecaDTO{" + "id=" + id + ", dataCriacao='" + dataCriacao + "'" + ", numeroProcesso='" + numeroProcesso
            + "'" + ", numeroPeca='" + numeroPeca + "'" + '}';
    }
}
