package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.dto.mandadoprisao.DadosDetracaoPenalDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.MandadoInternacaoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.MandadoPrisaoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.TipificacaoPenalDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.TipoGuiaGeradaDTO;
import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.pessoa.EstadoDTO;
import br.com.clientegatewayexterno.dto.pessoa.MunicipioDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;

/**
 * A DTO for the GuiaRecolhimento entity.
 */
public class GuiaRecolhimentoDTO extends PecaDTO implements Serializable {

    private static final long serialVersionUID = 7026286286960306049L;

    @Size(max = 150)
    private String localOcorrenciaDelito;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInfracao;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataRecebimentoDenunciaQueixa;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoPronuncia;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoSentenca;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataTransitoJulgadoDefesa;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPublicacaoAcordao;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataTransitoJulgadoMinisterioPublico;

    @Size(max = 150)
    private String localizacaoSituacaoAtualCondenado;

    @Size(max = 150)
    private String nomeDoDefensor;

    @Size(max = 4000)
    private String outrosProcessos;

    @Size(max = 4000)
    private String outrasInformacoes;

    @Max(value = 999)
    private Integer totalDiasDetraidosDetracaoPenal;

    @Max(value = 999)
    @NotNull
    private Integer totalDiaPenasImpostasProcesso;

    @Max(value = 999)
    @NotNull
    private Integer totalMesPenasImpostasProcesso;

    @Max(value = 999)
    @NotNull
    private Integer totalAnoPenasImpostasProcesso;

    @Max(value = 999)
    private Integer totalDiasMulta;

    private OrgaoDTO orgaoTribunal;

    private String numeroProcessoOrigem;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataFimSuspensao89;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataFimSuspensao366;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInicioSuspensao89;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInicioSuspensao366;

    private OrgaoDTO orgaoGuiaRecolhimento;

    private List<DadosDetracaoPenalDTO> dadosDetracaoPenals = new ArrayList<DadosDetracaoPenalDTO>();

    private List<PenaPecuniariaDTO> penaPecuniarias = new ArrayList<PenaPecuniariaDTO>();

    private List<PenaImpostaProcessoDTO> penaImpostaProcessos = new ArrayList<PenaImpostaProcessoDTO>();

    private EstadoDTO estado;

    private TipoGuiaDTO tipoGuia;

    private RegimePrisionalDTO regimePrisional;

    private ReincidenteDTO reincidente;

    private TipoGuiaGeradaDTO tipoGuiaGerada;

    private MunicipioDTO municipio;

    private List<TipificacaoPenalDTO> tipificacoesPenais;

    private MandadoPrisaoDTO mandadoPrisao;

    private String dataInfracaoToString;

    private String dataRecebimentoDenunciaQueixaToString;

    private String dataPublicacaoPronunciaToString;

    private String dataPublicacaoSentencaToString;

    private String dataTransitoJulgadoDefesaToString;

    private String dataPublicacaoAcordaoToString;

    private String dataTransitoJulgadoMinisterioPublicoToString;

    private MandadoInternacaoDTO mandadoInternacao;

    private GuiaRecolhimentoDTO guiaRecolhimentoProvisoria;

    public String getTipificacoesPenaisFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getTipificacoesPenais())) {
            List<String> tipificacoes = new ArrayList<>();
            this.getTipificacoesPenais().forEach(tipificacao -> tipificacoes.add(tipificacao
                .getRotulo()));
            return StringUtils.join(tipificacoes, " - ");
        } else {
            return null;
        }
    }

    public String getDadosDetracaoPenaisFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getDadosDetracaoPenals())) {
            List<String> descricoes = new ArrayList<>();
            this.getDadosDetracaoPenals().forEach(dadosDetracao -> {
                String descricao = "Data da Prisão: " + dadosDetracao.getDataPrisaoFormatada();
                descricao += ", Data da Soltura/Fuga: " + dadosDetracao.getDataSolturaFugaFormatada();
                descricao += ", Dias Destraídos: " + dadosDetracao.getDiasDetraidos();
                descricoes.add(descricao);
            });
            return StringUtils.join(descricoes, " - ");
        } else {
            return null;
        }
    }

    public String getPenaPecuniariasFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getPenaPecuniarias())) {
            List<String> descricoes = new ArrayList<>();
            this.getPenaPecuniarias().forEach(penaPecuniaria -> {
                String descricao = "Dias Multa: " + penaPecuniaria.getDiasMulta();
                descricao += ", Valor Multa: " + penaPecuniaria.getValorMulta();
                descricoes.add(descricao);
            });
            return StringUtils.join(descricoes, " - ");
        } else {
            return null;
        }
    }

    public String getLocalOcorrenciaDelito() {
        return localOcorrenciaDelito;
    }

    public void setLocalOcorrenciaDelito(String localOcorrenciaDelito) {
        this.localOcorrenciaDelito = localOcorrenciaDelito;
    }

    public LocalDate getDataInfracao() {
        return dataInfracao;
    }

    public void setDataInfracao(LocalDate dataInfracao) {
        this.dataInfracao = dataInfracao;
    }

    public LocalDate getDataRecebimentoDenunciaQueixa() {
        return dataRecebimentoDenunciaQueixa;
    }

    public void setDataRecebimentoDenunciaQueixa(LocalDate dataRecebimentoDenunciaQueixa) {
        this.dataRecebimentoDenunciaQueixa = dataRecebimentoDenunciaQueixa;
    }

    public LocalDate getDataPublicacaoPronuncia() {
        return dataPublicacaoPronuncia;
    }

    public void setDataPublicacaoPronuncia(LocalDate dataPublicacaoPronuncia) {
        this.dataPublicacaoPronuncia = dataPublicacaoPronuncia;
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

    public LocalDate getDataPublicacaoAcordao() {
        return dataPublicacaoAcordao;
    }

    public void setDataPublicacaoAcordao(LocalDate dataPublicacaoAcordao) {
        this.dataPublicacaoAcordao = dataPublicacaoAcordao;
    }

    public LocalDate getDataTransitoJulgadoMinisterioPublico() {
        return dataTransitoJulgadoMinisterioPublico;
    }

    public void setDataTransitoJulgadoMinisterioPublico(LocalDate dataTransitoJulgadoMinisterioPublico) {
        this.dataTransitoJulgadoMinisterioPublico = dataTransitoJulgadoMinisterioPublico;
    }

    public String getLocalizacaoSituacaoAtualCondenado() {
        return localizacaoSituacaoAtualCondenado;
    }

    public void setLocalizacaoSituacaoAtualCondenado(String localizacaoSituacaoAtualCondenado) {
        this.localizacaoSituacaoAtualCondenado = localizacaoSituacaoAtualCondenado;
    }

    public String getNomeDoDefensor() {
        return nomeDoDefensor;
    }

    public void setNomeDoDefensor(String nomeDoDefensor) {
        this.nomeDoDefensor = nomeDoDefensor;
    }

    public String getOutrosProcessos() {
        return outrosProcessos;
    }

    public void setOutrosProcessos(String outrosProcessos) {
        this.outrosProcessos = outrosProcessos;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    public void setOutrasInformacoes(String outrasInformacoes) {
        this.outrasInformacoes = outrasInformacoes;
    }

    public Integer getTotalDiasDetraidosDetracaoPenal() {
        return totalDiasDetraidosDetracaoPenal;
    }

    public void setTotalDiasDetraidosDetracaoPenal(Integer totalDiasDetraidosDetracaoPenal) {
        this.totalDiasDetraidosDetracaoPenal = totalDiasDetraidosDetracaoPenal;
    }

    public Integer getTotalDiaPenasImpostasProcesso() {
        return totalDiaPenasImpostasProcesso;
    }

    public void setTotalDiaPenasImpostasProcesso(Integer totalDiaPenasImpostasProcesso) {
        this.totalDiaPenasImpostasProcesso = totalDiaPenasImpostasProcesso;
    }

    public Integer getTotalMesPenasImpostasProcesso() {
        return totalMesPenasImpostasProcesso;
    }

    public void setTotalMesPenasImpostasProcesso(Integer totalMesPenasImpostasProcesso) {
        this.totalMesPenasImpostasProcesso = totalMesPenasImpostasProcesso;
    }

    public Integer getTotalAnoPenasImpostasProcesso() {
        return totalAnoPenasImpostasProcesso;
    }

    public void setTotalAnoPenasImpostasProcesso(Integer totalAnoPenasImpostasProcesso) {
        this.totalAnoPenasImpostasProcesso = totalAnoPenasImpostasProcesso;
    }

    public Integer getTotalDiasMulta() {
        return totalDiasMulta;
    }

    public void setTotalDiasMulta(Integer totalDiasMulta) {
        this.totalDiasMulta = totalDiasMulta;
    }

    public OrgaoDTO getOrgaoTribunal() {
        return orgaoTribunal;
    }

    public void setOrgaoTribunal(OrgaoDTO orgaoTribunal) {
        this.orgaoTribunal = orgaoTribunal;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public TipoGuiaDTO getTipoGuia() {
        return tipoGuia;
    }

    public void setTipoGuia(TipoGuiaDTO tipoGuia) {
        this.tipoGuia = tipoGuia;
    }

    public RegimePrisionalDTO getRegimePrisional() {
        return regimePrisional;
    }

    public void setRegimePrisional(RegimePrisionalDTO regimePrisional) {
        this.regimePrisional = regimePrisional;
    }

    public ReincidenteDTO getReincidente() {
        return reincidente;
    }

    public void setReincidente(ReincidenteDTO reincidente) {
        this.reincidente = reincidente;
    }

    public List<DadosDetracaoPenalDTO> getDadosDetracaoPenals() {
        return dadosDetracaoPenals;
    }

    public void setDadosDetracaoPenals(List<DadosDetracaoPenalDTO> dadosDetracaoPenals) {
        this.dadosDetracaoPenals = dadosDetracaoPenals;
    }

    public List<PenaPecuniariaDTO> getPenaPecuniarias() {
        return penaPecuniarias;
    }

    public void setPenaPecuniarias(List<PenaPecuniariaDTO> penaPecuniarias) {
        this.penaPecuniarias = penaPecuniarias;
    }

    public List<PenaImpostaProcessoDTO> getPenaImpostaProcessos() {
        return penaImpostaProcessos;
    }

    public void setPenaImpostaProcessos(List<PenaImpostaProcessoDTO> penaImpostaProcessos) {
        this.penaImpostaProcessos = penaImpostaProcessos;
    }

    public List<TipificacaoPenalDTO> getTipificacoesPenais() {
        return tipificacoesPenais;
    }

    public void setTipificacoesPenais(
        List<TipificacaoPenalDTO> pTipificacoesPenais) {
        tipificacoesPenais = pTipificacoesPenais;
    }

    public TipoGuiaGeradaDTO getTipoGuiaGerada() {
        return tipoGuiaGerada;
    }

    public void setTipoGuiaGerada(TipoGuiaGeradaDTO tipoGuiaGerada) {
        this.tipoGuiaGerada = tipoGuiaGerada;
    }

    public String getNumeroProcessoOrigem() {
        return numeroProcessoOrigem;
    }

    public void setNumeroProcessoOrigem(String numeroProcessoOrigem) {
        this.numeroProcessoOrigem = numeroProcessoOrigem;
    }

    public LocalDate getDataInicioSuspensao366() {
        return dataInicioSuspensao366;
    }

    public void setDataInicioSuspensao366(LocalDate dataInicioSuspensao366) {
        this.dataInicioSuspensao366 = dataInicioSuspensao366;
    }

    public LocalDate getDataFimSuspensao366() {
        return dataFimSuspensao366;
    }

    public void setDataFimSuspensao366(LocalDate dataFimSuspensao366) {
        this.dataFimSuspensao366 = dataFimSuspensao366;
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

    public OrgaoDTO getOrgaoGuiaRecolhimento() {
        return orgaoGuiaRecolhimento;
    }

    public void setOrgaoGuiaRecolhimento(OrgaoDTO orgaoGuiaRecolhimento) {
        this.orgaoGuiaRecolhimento = orgaoGuiaRecolhimento;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public MandadoPrisaoDTO getMandadoPrisao() {
        return mandadoPrisao;
    }

    public void setMandadoPrisao(MandadoPrisaoDTO mandadoPrisao) {
        this.mandadoPrisao = mandadoPrisao;
    }

    public MandadoInternacaoDTO getMandadoInternacao() {
        return mandadoInternacao;
    }

    public void setMandadoInternacao(MandadoInternacaoDTO mandadoInternacao) {
        this.mandadoInternacao = mandadoInternacao;
    }

    public String getDataInfracaoToString() {
        return dataInfracaoToString;
    }

    public void setDataInfracaoToString(String dataInfracaoToString) {
        this.dataInfracaoToString = dataInfracaoToString;
    }

    public String getDataRecebimentoDenunciaQueixaToString() {
        return dataRecebimentoDenunciaQueixaToString;
    }

    public void setDataRecebimentoDenunciaQueixaToString(String dataRecebimentoDenunciaQueixaToString) {
        this.dataRecebimentoDenunciaQueixaToString = dataRecebimentoDenunciaQueixaToString;
    }

    public String getDataPublicacaoPronunciaToString() {
        return dataPublicacaoPronunciaToString;
    }

    public void setDataPublicacaoPronunciaToString(String dataPublicacaoPronunciaToString) {
        this.dataPublicacaoPronunciaToString = dataPublicacaoPronunciaToString;
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

    public String getDataPublicacaoAcordaoToString() {
        return dataPublicacaoAcordaoToString;
    }

    public void setDataPublicacaoAcordaoToString(String dataPublicacaoAcordaoToString) {
        this.dataPublicacaoAcordaoToString = dataPublicacaoAcordaoToString;
    }

    public String getDataTransitoJulgadoMinisterioPublicoToString() {
        return dataTransitoJulgadoMinisterioPublicoToString;
    }

    public void setDataTransitoJulgadoMinisterioPublicoToString(String dataTransitoJulgadoMinisterioPublicoToString) {
        this.dataTransitoJulgadoMinisterioPublicoToString = dataTransitoJulgadoMinisterioPublicoToString;
    }

    public GuiaRecolhimentoDTO getGuiaRecolhimentoProvisoria() {
        return guiaRecolhimentoProvisoria;
    }

    public void setGuiaRecolhimentoProvisoria(GuiaRecolhimentoDTO guiaRecolhimentoProvisoria) {
        this.guiaRecolhimentoProvisoria = guiaRecolhimentoProvisoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GuiaRecolhimentoDTO guiaRecolhimentoDTO = (GuiaRecolhimentoDTO) o;
        if (guiaRecolhimentoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), guiaRecolhimentoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "GuiaRecolhimentoDTO{" + "id=" + getId() + ", localOcorrenciaDelito='" + getLocalOcorrenciaDelito() + "'"
            + ", dataInfracao='" + getDataInfracao() + "'" + ", dataRecebimentoDenunciaQueixa='"
            + getDataRecebimentoDenunciaQueixa() + "'" + ", dataPublicacaoPronuncia='" + getDataPublicacaoPronuncia()
            + "'" + ", dataPublicacaoSentenca='" + getDataPublicacaoSentenca() + "'" + ", dataTransitoJulgadoDefesa='"
            + getDataTransitoJulgadoDefesa() + "'" + ", dataPublicacaoAcordao='" + getDataPublicacaoAcordao() + "'"
            + ", dataTransitoJulgadoMinisterioPublico='" + getDataTransitoJulgadoMinisterioPublico() + "'"
            + ", localizacaoSituacaoAtualCondenado='" + getLocalizacaoSituacaoAtualCondenado() + "'"
            + ", nomeDoDefensor='" + getNomeDoDefensor() + "'" + ", outrosProcessos='" + getOutrosProcessos() + "'"
            + ", outrasInformacoes='" + getOutrasInformacoes() + "'" + ", totalDiasDetraidosDetracaoPenal='"
            + getTotalDiasDetraidosDetracaoPenal() + "'" + ", totalDiaPenasImpostasProcesso='"
            + getTotalDiaPenasImpostasProcesso() + "'" + ", totalMesPenasImpostasProcesso='"
            + getTotalMesPenasImpostasProcesso() + "'" + ", totalAnoPenasImpostasProcesso='"
            + getTotalAnoPenasImpostasProcesso() + "'" + ", totalDiasMulta='" + getTotalDiasMulta() + "'"
            + ", numeroProcessoOrigem='" + getNumeroProcessoOrigem() + "'" + ", dataInicioSuspensao366='"
            + getDataInicioSuspensao366() + "'" + ", dataFimSuspensao366='" + getDataFimSuspensao366() + "'"
            + ", dataInicioSuspensao89='" + getDataInicioSuspensao89() + "'" + ", dataFimSuspensao89='"
            + getDataFimSuspensao89() + "'" + "}";
    }
}
