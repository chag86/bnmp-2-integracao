package br.com.clientegatewayexterno.dto.mandadoprisao;

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

import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;
import br.com.clientegatewayexterno.util.ToStringUtil;

/**
 * A DTO for the MandadoInternacao entity.
 */
public class MandadoInternacaoDTO extends PecaDTO implements Serializable {

    private static final long serialVersionUID = -2842495783771960854L;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    @NotNull
    private LocalDate dataValidade;

    @Size(max = 150)
    private String prazoMinimoInternacao;

    @Size(max = 150)
    private String localOcorrencia;

    @NotNull
    @Size(max = 4000)
    private String sinteseDecisao;

    @Size(max = 4000)
    private String cumprimento;

    @Size(max = 4000)
    private String observacao;

    private EspecieInternacaoDTO especieInternacao;

    private List<TipificacaoPenalDTO> tipificacoesPenais;

    private RegimePrisionalDTO regimePrisional;

    private OrgaoDTO orgaoJudiciario;

    @Max(value = 999)
    private Integer tempoPenaAno;

    @Max(value = 999)
    private Integer tempoPenaMes;

    @Max(value = 999)
    private Integer tempoPenaDia;

    private String tempoPena;

    private String dataValidadeToString;

    private GuiaInternacaoDTO guiaInternacao;

    public String getTipificacoesPenaisFormatadas() {
        if (CollectionUtils.isNotEmpty(this.getTipificacoesPenais())) {
            List<String> tipificacoes = new ArrayList<>();
            this.getTipificacoesPenais().forEach(tipificacao -> tipificacoes.add(tipificacao.getRotulo()));
            return StringUtils.join(tipificacoes, " - ");
        } else {
            return null;
        }
    }

    public String getDataValidadeFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataValidade);
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getPrazoMinimoInternacao() {
        return prazoMinimoInternacao;
    }

    public void setPrazoMinimoInternacao(String prazoMinimoInternacao) {
        this.prazoMinimoInternacao = prazoMinimoInternacao;
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

    public EspecieInternacaoDTO getEspecieInternacao() {
        return especieInternacao;
    }

    public void setEspecieInternacao(EspecieInternacaoDTO especieInternacao) {
        this.especieInternacao = especieInternacao;
    }

    public List<TipificacaoPenalDTO> getTipificacoesPenais() {
        return tipificacoesPenais;
    }

    public void setTipificacoesPenais(List<TipificacaoPenalDTO> tipificacoesPenais) {
        this.tipificacoesPenais = tipificacoesPenais;
    }

    public RegimePrisionalDTO getRegimePrisional() {
        return regimePrisional;
    }

    public void setRegimePrisional(RegimePrisionalDTO regimePrisional) {
        this.regimePrisional = regimePrisional;
    }

    public OrgaoDTO getOrgaoJudiciario() {
        return orgaoJudiciario;
    }

    public void setOrgaoJudiciario(OrgaoDTO orgaoJudiciario) {
        this.orgaoJudiciario = orgaoJudiciario;
    }

    public Integer getTempoPenaDia() {
        return tempoPenaDia;
    }

    public void setTempoPenaDia(Integer tempoPenaDia) {
        this.tempoPenaDia = tempoPenaDia;
    }

    public Integer getTempoPenaMes() {
        return tempoPenaMes;
    }

    public void setTempoPenaMes(Integer tempoPenaMes) {
        this.tempoPenaMes = tempoPenaMes;
    }

    public Integer getTempoPenaAno() {
        return tempoPenaAno;
    }

    public void setTempoPenaAno(Integer tempoPenaAno) {
        this.tempoPenaAno = tempoPenaAno;
    }

    public String getTempoPena() {
        return tempoPena;
    }

    public void setTempoPena(String tempoPena) {
        this.tempoPena = tempoPena;
    }

    public String getDataValidadeToString() {
        return dataValidadeToString;
    }

    public void setDataValidadeToString(String dataValidadeToString) {
        this.dataValidadeToString = dataValidadeToString;
    }

    public void preencheTempoPena() {
        tempoPena = "";
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

    public GuiaInternacaoDTO getGuiaInternacao() {
        return guiaInternacao;
    }

    public void setGuiaInternacao(GuiaInternacaoDTO guiaInternacao) {
        this.guiaInternacao = guiaInternacao;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MandadoInternacaoDTO mandadoInternacaoDTO = (MandadoInternacaoDTO) o;
        if (mandadoInternacaoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mandadoInternacaoDTO.getId());
    }

    @Override
    public String toString() {
        return "MandadoInternacaoDTO{" + "id=" + getId() + ", dataValidade='" + getDataValidade() + "'"
            + ", prazoMinimoInternacao='" + getPrazoMinimoInternacao() + "'" + ", localOcorrencia='"
            + getLocalOcorrencia() + "'" + ", sinteseDecisao='" + getSinteseDecisao() + "'" + ", cumprimento='"
            + getCumprimento() + "'" + ", observacao='" + getObservacao() + "'" + "}";
    }
}
