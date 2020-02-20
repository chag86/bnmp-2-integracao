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

import br.com.clientegatewayexterno.dto.guiarecolhimento.GuiaRecolhimentoDTO;
import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;
import br.com.clientegatewayexterno.util.ToStringUtil;



/**
 * A DTO for the MandadoPrisao entity.
 */
public class MandadoPrisaoDTO extends PecaDTO implements Serializable {

    private static final long serialVersionUID = 8349269333010594242L;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    @NotNull
    private LocalDate dataValidade;

    private EspeciePrisaoDTO especiePrisao;

    private Integer prazoPrisao;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataInfracao;

    @Size(max = 150)
    private String localOcorrencia;

    @NotNull
    @Size(max = 4000)
    private String sinteseDecisao;

    private RegimePrisionalDTO regimePrisional;

    @Max(value = 999)
    private Integer tempoPenaAno;

    @Max(value = 999)
    private Integer tempoPenaMes;

    @Max(value = 999)
    private Integer tempoPenaDia;

    @Size(max = 4000)
    private String cumprimento;

    @Size(max = 4000)
    private String observacao;

    private OrgaoDTO orgaoJudiciario;

    private String tempoPena;

    private List<TipificacaoPenalDTO> tipificacoesPenais;

    private GuiaRecolhimentoDTO guiaRecolhimento;

    private SigiloDTO sigilo;

    private String dataValidadeToString;

    private String dataInfracaoToString;

    public String getDataValidadeFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataValidade);
    }

    public String getTipificacoesPenaisFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getTipificacoesPenais())) {
            List<String> tipificacoes = new ArrayList<>();
            this.getTipificacoesPenais().forEach(tipificacao -> tipificacoes.add(tipificacao.getRotulo()));
            return StringUtils.join(tipificacoes, " - ");
        } else {
            return null;
        }
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public EspeciePrisaoDTO getEspeciePrisao() {
        return especiePrisao;
    }

    public void setEspeciePrisao(EspeciePrisaoDTO especiePrisao) {
        this.especiePrisao = especiePrisao;
    }

    public Integer getPrazoPrisao() {
        return prazoPrisao;
    }

    public void setPrazoPrisao(Integer prazoPrisao) {
        this.prazoPrisao = prazoPrisao;
    }

    public LocalDate getDataInfracao() {
        return dataInfracao;
    }

    public void setDataInfracao(LocalDate dataInfracao) {
        this.dataInfracao = dataInfracao;
    }

    public String getLocalOcorrencia() {
        return localOcorrencia;
    }

    public void setLocalOcorrencia(String localOcorrencia) {
        this.localOcorrencia = localOcorrencia;
    }

    public String getSinteseDecisao() {
        return sinteseDecisao;
    }

    public void setSinteseDecisao(String sinteseDecisao) {
        this.sinteseDecisao = sinteseDecisao;
    }

    public RegimePrisionalDTO getRegimePrisional() {
        return regimePrisional;
    }

    public void setRegimePrisional(RegimePrisionalDTO regimePrisional) {
        this.regimePrisional = regimePrisional;
    }

    public Integer getTempoPenaAno() {
        return tempoPenaAno;
    }

    public void setTempoPenaAno(Integer tempoPenaAno) {
        this.tempoPenaAno = tempoPenaAno;
    }

    public Integer getTempoPenaMes() {
        return tempoPenaMes;
    }

    public void setTempoPenaMes(Integer tempoPenaMes) {
        this.tempoPenaMes = tempoPenaMes;
    }

    public Integer getTempoPenaDia() {
        return tempoPenaDia;
    }

    public void setTempoPenaDia(Integer tempoPenaDia) {
        this.tempoPenaDia = tempoPenaDia;
    }

    public String getCumprimento() {
        return cumprimento;
    }

    public void setCumprimento(String cumprimento) {
        this.cumprimento = cumprimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<TipificacaoPenalDTO> getTipificacoesPenais() {
        return tipificacoesPenais;
    }

    public void setTipificacoesPenais(List<TipificacaoPenalDTO> tipificacoesPenais) {
        this.tipificacoesPenais = tipificacoesPenais;
    }

    public String getTempoPena() {
        return tempoPena;
    }

    public void setTempoPena(String tempoPena) {
        this.tempoPena = tempoPena;
    }

    public SigiloDTO getSigilo() {
        return sigilo;
    }

    public void setSigilo(SigiloDTO sigilo) {
        this.sigilo = sigilo;
    }

    public String getDataValidadeToString() {
        return dataValidadeToString;
    }

    public void setDataValidadeToString(String dataValidadeToString) {
        this.dataValidadeToString = dataValidadeToString;
    }

    public String getDataInfracaoToString() {
        return dataInfracaoToString;
    }

    public void setDataInfracaoToString(String dataInfracaoToString) {
        this.dataInfracaoToString = dataInfracaoToString;
    }

    public OrgaoDTO getOrgaoJudiciario() {
        return orgaoJudiciario;
    }

    public void setOrgaoJudiciario(OrgaoDTO orgaoJudiciario) {
        this.orgaoJudiciario = orgaoJudiciario;
    }

    public GuiaRecolhimentoDTO getGuiaRecolhimento() {
        return guiaRecolhimento;
    }

    public void setGuiaRecolhimento(GuiaRecolhimentoDTO guiaRecolhimento) {
        this.guiaRecolhimento = guiaRecolhimento;
    }

    public void preencheTempoPena() {
        tempoPena = null;
        if (tempoPenaAno != null) {
            tempoPena = tempoPenaAno.toString() + " ano(s) ";
        }

        if (tempoPenaMes != null) {
            tempoPena = tempoPena + tempoPenaMes.toString() + " mês(es) ";
        }

        if (tempoPenaDia != null) {
            tempoPena = tempoPena + tempoPenaDia.toString() + " dia(s).";
        }

    }

    @Override
    public String toString() {
        return "MandadoPrisaoDTO{" + "id=" + getId() + ", dataExpedicao='" + getDataExpedicao() + "'"
            + ", dataValidade='" + getDataValidade() + "'" + ", numeroProcesso='" + getNumeroProcesso() + "'"
            + ", especiePrisao='" + getEspeciePrisao() + "'" + ", prazoPrisao='" + getPrazoPrisao() + "'"
            + ", localOcorrencia='" + getLocalOcorrencia() + "'" + ", sinteseDecisao='" + getSinteseDecisao() + "'"
            + ", regimePrisional='" + getRegimePrisional() + "'" + ", tempoPenaAno='" + getTempoPenaAno() + "'"
            + ", tempoPenaMes='" + getTempoPenaMes() + "'" + ", tempoPenaDia='" + getTempoPenaDia() + "'"
            + ", cumprimento='" + getCumprimento() + "'" + ", observacao='" + getObservacao() + "'" + ", nomeServidor='"
            + getNomeServidor() + "'" + ", cargoServidor='" + getCargoServidor() + "'" + ", magistrado='"
            + getMagistrado() + "'" + "}";
    }
}
