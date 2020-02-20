package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.pessoa.EstadoDTO;
import br.com.clientegatewayexterno.dto.pessoa.MunicipioDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;
import br.com.clientegatewayexterno.util.ToStringUtil;

/**
 * A DTO for the GuiaInternacao entity.
 */
public class GuiaInternacaoDTO extends PecaDTO implements Serializable {

    private static final long serialVersionUID = 7774969959649101192L;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInfracao;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataRecebimentoDenuncia;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoSentenca;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataTransitoJulgadoDefesa;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataTransitoJulgadoMinisterioPublico;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoPronuncia;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoAcordao;

    @Size(max = 150)
    private String localOcorrenciaInfracao;

    @Size(max = 150)
    private String suspensaoPeloArtigo366Cpp;

    @Size(max = 150)
    private String nomeDefensor;

    @Size(max = 4000)
    private String outrosProcessos;

    @Size(max = 4000)
    private String observacoes;

    private MedidaSegurancaAplicadaDTO medidaSegurancaAplicada;

    private TipoGuiaInternacaoDTO tipoGuiaInternacao;

    private MunicipioDTO municipio;

    private EstadoDTO estado;

    private OrgaoDTO orgaoTribunal;

    @Max(value = 999)
    private Integer totalDiasDetraidosDetracaoPenal;

    private List<TipificacaoPenalDTO> tipificacoesPenais;

    private List<DadosDetracaoPenalDTO> dadosDetracaoPenals = new ArrayList<DadosDetracaoPenalDTO>();

    private String dataInfracaoToString;

    private String dataRecebimentoDenunciaToString;

    private String dataPublicacaoSentencaToString;

    private String dataTransitoJulgadoDefesaToString;

    private String dataTransitoJulgadoMinisterioPublicoToString;

    private String dataPublicacaoPronunciaToString;

    private String dataPublicacaoAcordaoToString;

    private MandadoInternacaoDTO mandadoInternacao;

    @NotNull
    private OrgaoDTO orgaoGuiaInternacao;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInicioSuspensao366;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataFimSuspensao366;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInicioSuspensao89;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataFimSuspensao89;

    private MandadoPrisaoDTO mandadoPrisao;

    public String getTipificacoesPenaisFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getTipificacoesPenais())) {
            List<String> tipificacoes = new ArrayList<>();
            this.getTipificacoesPenais().forEach(tipificacao -> tipificacoes.add(tipificacao.getRotulo()));
            return StringUtils.join(tipificacoes, " - ");
        } else {
            return null;
        }
    }

    public String getDataInfracaoFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataInfracao);
    }

    public String getDataRecebimentoDenunciaFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataRecebimentoDenuncia);
    }

    public String getDataPublicacaoSentencaFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataPublicacaoSentenca);
    }

    public String getDataTransitoJulgadoDefesaFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataTransitoJulgadoDefesa);
    }

    public String getDataTransitoJulgadoMinisterioPublicoFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataTransitoJulgadoMinisterioPublico);
    }

    public LocalDate getDataInfracao() {
        return dataInfracao;
    }

    public void setDataInfracao(LocalDate dataInfracao) {
        this.dataInfracao = dataInfracao;
    }

    public LocalDate getDataRecebimentoDenuncia() {
        return dataRecebimentoDenuncia;
    }

    public void setDataRecebimentoDenuncia(LocalDate dataRecebimentoDenuncia) {
        this.dataRecebimentoDenuncia = dataRecebimentoDenuncia;
    }

    public LocalDate getDataPublicacaoSentenca() {
        return dataPublicacaoSentenca;
    }

    public void setDataPublicacaoSentenca(LocalDate dataPublicacaoSentenca) {
        this.dataPublicacaoSentenca = dataPublicacaoSentenca;
    }

    public LocalDate getDataTransitoJulgadoDefesa() {
        return dataTransitoJulgadoDefesa;
    }

    public void setDataTransitoJulgadoDefesa(LocalDate dataTransitoJulgadoDefesa) {
        this.dataTransitoJulgadoDefesa = dataTransitoJulgadoDefesa;
    }

    public LocalDate getDataTransitoJulgadoMinisterioPublico() {
        return dataTransitoJulgadoMinisterioPublico;
    }

    public void setDataTransitoJulgadoMinisterioPublico(LocalDate dataTransitoJulgadoMinisterioPublico) {
        this.dataTransitoJulgadoMinisterioPublico = dataTransitoJulgadoMinisterioPublico;
    }

    public LocalDate getDataPublicacaoPronuncia() {
        return dataPublicacaoPronuncia;
    }

    public void setDataPublicacaoPronuncia(LocalDate dataPublicacaoPronuncia) {
        this.dataPublicacaoPronuncia = dataPublicacaoPronuncia;
    }

    public LocalDate getDataPublicacaoAcordao() {
        return dataPublicacaoAcordao;
    }

    public void setDataPublicacaoAcordao(LocalDate dataPublicacaoAcordao) {
        this.dataPublicacaoAcordao = dataPublicacaoAcordao;
    }

    public String getLocalOcorrenciaInfracao() {
        return localOcorrenciaInfracao;
    }

    public void setLocalOcorrenciaInfracao(String localOcorrenciaInfracao) {
        this.localOcorrenciaInfracao = localOcorrenciaInfracao;
    }

    public String getSuspensaoPeloArtigo366Cpp() {
        return suspensaoPeloArtigo366Cpp;
    }

    public void setSuspensaoPeloArtigo366Cpp(String suspensaoPeloArtigo366Cpp) {
        this.suspensaoPeloArtigo366Cpp = suspensaoPeloArtigo366Cpp;
    }

    public String getNomeDefensor() {
        return nomeDefensor;
    }

    public void setNomeDefensor(String nomeDefensor) {
        this.nomeDefensor = nomeDefensor;
    }

    public String getOutrosProcessos() {
        return outrosProcessos;
    }

    public void setOutrosProcessos(String outrosProcessos) {
        this.outrosProcessos = outrosProcessos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public MedidaSegurancaAplicadaDTO getMedidaSegurancaAplicada() {
        return medidaSegurancaAplicada;
    }

    public void setMedidaSegurancaAplicada(MedidaSegurancaAplicadaDTO medidaSegurancaAplicada) {
        this.medidaSegurancaAplicada = medidaSegurancaAplicada;
    }

    public TipoGuiaInternacaoDTO getTipoGuiaInternacao() {
        return tipoGuiaInternacao;
    }

    public void setTipoGuiaInternacao(TipoGuiaInternacaoDTO tipoGuiaInternacao) {
        this.tipoGuiaInternacao = tipoGuiaInternacao;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public OrgaoDTO getOrgaoTribunal() {
        return orgaoTribunal;
    }

    public void setOrgaoTribunal(OrgaoDTO orgaoTribunal) {
        this.orgaoTribunal = orgaoTribunal;
    }

    public Integer getTotalDiasDetraidosDetracaoPenal() {
        return totalDiasDetraidosDetracaoPenal;
    }

    public void setTotalDiasDetraidosDetracaoPenal(Integer totalDiasDetraidosDetracaoPenal) {
        this.totalDiasDetraidosDetracaoPenal = totalDiasDetraidosDetracaoPenal;
    }

    public List<TipificacaoPenalDTO> getTipificacoesPenais() {
        return tipificacoesPenais;
    }

    public void setTipificacoesPenais(List<TipificacaoPenalDTO> tipificacoesPenais) {
        this.tipificacoesPenais = tipificacoesPenais;
    }

    public List<DadosDetracaoPenalDTO> getDadosDetracaoPenals() {
        return dadosDetracaoPenals;
    }

    public void setDadosDetracaoPenals(List<DadosDetracaoPenalDTO> dadosDetracaoPenals) {
        this.dadosDetracaoPenals = dadosDetracaoPenals;
    }

    public String getDataInfracaoToString() {
        return dataInfracaoToString;
    }

    public void setDataInfracaoToString(String dataInfracaoToString) {
        this.dataInfracaoToString = dataInfracaoToString;
    }

    public String getDataRecebimentoDenunciaToString() {
        return dataRecebimentoDenunciaToString;
    }

    public void setDataRecebimentoDenunciaToString(String dataRecebimentoDenunciaToString) {
        this.dataRecebimentoDenunciaToString = dataRecebimentoDenunciaToString;
    }

    public String getDataPublicacaoSentencaToString() {
        return dataPublicacaoSentencaToString;
    }

    public void setDataPublicacaoSentencaToString(String dataPublicacaoSentencaToString) {
        this.dataPublicacaoSentencaToString = dataPublicacaoSentencaToString;
    }

    public String getDataTransitoJulgadoDefesaToString() {
        return dataTransitoJulgadoDefesaToString;
    }

    public void setDataTransitoJulgadoDefesaToString(String dataTransitoJulgadoDefesaToString) {
        this.dataTransitoJulgadoDefesaToString = dataTransitoJulgadoDefesaToString;
    }

    public String getDataTransitoJulgadoMinisterioPublicoToString() {
        return dataTransitoJulgadoMinisterioPublicoToString;
    }

    public void setDataTransitoJulgadoMinisterioPublicoToString(String dataTransitoJulgadoMinisterioPublicoToString) {
        this.dataTransitoJulgadoMinisterioPublicoToString = dataTransitoJulgadoMinisterioPublicoToString;
    }

    public String getDataPublicacaoPronunciaToString() {
        return dataPublicacaoPronunciaToString;
    }

    public void setDataPublicacaoPronunciaToString(String dataPublicacaoPronunciaToString) {
        this.dataPublicacaoPronunciaToString = dataPublicacaoPronunciaToString;
    }

    public String getDataPublicacaoAcordaoToString() {
        return dataPublicacaoAcordaoToString;
    }

    public void setDataPublicacaoAcordaoToString(String dataPublicacaoAcordaoToString) {
        this.dataPublicacaoAcordaoToString = dataPublicacaoAcordaoToString;
    }

    public MandadoInternacaoDTO getMandadoInternacao() {
        return mandadoInternacao;
    }

    public void setMandadoInternacao(MandadoInternacaoDTO mandadoInternacao) {
        this.mandadoInternacao = mandadoInternacao;
    }

    public OrgaoDTO getOrgaoGuiaInternacao() {
        return orgaoGuiaInternacao;
    }

    public void setOrgaoGuiaInternacao(OrgaoDTO orgaoGuiaInternacao) {
        this.orgaoGuiaInternacao = orgaoGuiaInternacao;
    }

    public LocalDate getDataInicioSuspensao366() {
        return dataInicioSuspensao366;
    }

    public void setDataInicioSuspensao366(LocalDate dataInicioSuspensao366) {
        this.dataInicioSuspensao366 = dataInicioSuspensao366;
    }

    public MandadoPrisaoDTO getMandadoPrisao() {
        return mandadoPrisao;
    }

    public LocalDate getDataFimSuspensao366() {
        return dataFimSuspensao366;
    }

    public void setDataFimSuspensao366(LocalDate dataFimSuspensao366) {
        this.dataFimSuspensao366 = dataFimSuspensao366;
    }

    public void setMandadoPrisao(MandadoPrisaoDTO mandadoPrisao) {
        this.mandadoPrisao = mandadoPrisao;
    }

    public LocalDate getDataInicioSuspensao89() {
        return dataInicioSuspensao89;
    }

    public void setDataInicioSuspensao89(LocalDate dataInicioSuspensao89) {
        this.dataInicioSuspensao89 = dataInicioSuspensao89;
    }

    public LocalDate getDataFimSuspensao89() {
        return dataFimSuspensao89;
    }

    public void setDataFimSuspensao89(LocalDate dataFimSuspensao89) {
        this.dataFimSuspensao89 = dataFimSuspensao89;
    }

    @Override
    public String toString() {
        return "GuiaInternacaoDTO{" + "id=" + getId() + ", dataInfracao='" + dataInfracao + "'"
            + ", dataRecebimentoDenuncia='" + dataRecebimentoDenuncia + "'" + ", dataPublicacaoSentenca='"
            + dataPublicacaoSentenca + "'" + ", dataTransitoJulgadoDefesa='" + dataTransitoJulgadoDefesa + "'"
            + ", dataTransitoJulgadoMinisterioPublico='" + dataTransitoJulgadoMinisterioPublico + "'"
            + ", dataPublicacaoPronuncia='" + dataPublicacaoPronuncia + "'" + ", dataPublicacaoAcordao='"
            + dataPublicacaoAcordao + "'" + ", suspensaoPeloArtigo366Cpp='" + suspensaoPeloArtigo366Cpp + "'"
            + ", nomeDefensor='" + nomeDefensor + "'" + ", outrosProcessos='" + outrosProcessos + "'"
            + ", observacoes='" + observacoes + "'" + ", localOcorrenciaInfracao='" + localOcorrenciaInfracao + "'"
            + "'" + '}';
    }
}
