package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.dto.guiarecolhimento.GuiaRecolhimentoDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;
import br.com.clientegatewayexterno.util.ToStringUtil;

/**
 * A DTO for the DadosDetracaoPenal entity.
 */
public class DadosDetracaoPenalDTO implements Serializable {

    private static final long serialVersionUID = -6654540912947892608L;

    private Long id;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataPrisao;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dataSolturaFuga;

    @Max(value = 999)
    private Integer diasDetraidos;

    private GuiaRecolhimentoDTO guiaRecolhimento;

    //private GuiaInternacaoDTO guiaInternacao;

    private String dataPrisaoToString;

    private String dataSolturaFugaToString;

    public String getDataPrisaoFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataPrisao);
    }

    public String getDataSolturaFugaFormatada() {
        return ToStringUtil.transformaLocalDateEmString(this.dataSolturaFuga);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPrisao() {
        return dataPrisao;
    }

    public void setDataPrisao(LocalDate dataPrisao) {
        this.dataPrisao = dataPrisao;
    }

    public LocalDate getDataSolturaFuga() {
        return dataSolturaFuga;
    }

    public void setDataSolturaFuga(LocalDate dataSolturaFuga) {
        this.dataSolturaFuga = dataSolturaFuga;
    }

    public Integer getDiasDetraidos() {
        return diasDetraidos;
    }

    public void setDiasDetraidos(Integer diasDetraidos) {
        this.diasDetraidos = diasDetraidos;
    }

    public GuiaRecolhimentoDTO getGuiaRecolhimento() {
        return guiaRecolhimento;
    }

    public void setGuiaRecolhimento(GuiaRecolhimentoDTO guiaRecolhimento) {
        this.guiaRecolhimento = guiaRecolhimento;
    }

    /*public GuiaInternacaoDTO getGuiaInternacao() {
        return guiaInternacao;
    }

    public void setGuiaInternacao(GuiaInternacaoDTO guiaInternacao) {
        this.guiaInternacao = guiaInternacao;
    }*/

    public String getDataPrisaoToString() {
        return dataPrisaoToString;
    }

    public void setDataPrisaoToString(String dataPrisaoToString) {
        this.dataPrisaoToString = dataPrisaoToString;
    }

    public String getDataSolturaFugaToString() {
        return dataSolturaFugaToString;
    }

    public void setDataSolturaFugaToString(String dataSolturaFugaToString) {
        this.dataSolturaFugaToString = dataSolturaFugaToString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DadosDetracaoPenalDTO dadosDetracaoPenalDTO = (DadosDetracaoPenalDTO) o;
        if (dadosDetracaoPenalDTO.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, dadosDetracaoPenalDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DadosDetracaoPenalDTO{" + "id=" + id + ", dataPrisao='" + dataPrisao + "'" + ", dataSolturaFuga='"
            + dataSolturaFuga + "'" + ", diasDetraidos='" + diasDetraidos + "'" + '}';
    }
}
