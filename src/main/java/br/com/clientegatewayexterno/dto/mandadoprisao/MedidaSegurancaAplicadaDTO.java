package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;


/**
 * A DTO for the MedidaSegurancaAplicada entity.
 */
public class MedidaSegurancaAplicadaDTO implements Serializable {

    private static final long serialVersionUID = -7401253369351439192L;

    private Long id;

    @NotNull
    @Size(max = 150)
    private String prazoMinimoInternacao;

    @Size(max = 150)
    private String localCumprimento;

    @Size(max = 150)
    private String condicoesImpostas;

    @Size(max = 150)
    private String nomeCurador;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    @NotNull
    private LocalDate dataEmissaoLaudo;

    @Size(max = 150)
    private String crmMedico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCondicoesImpostas() {
        return condicoesImpostas;
    }

    public void setCondicoesImpostas(String condicoesImpostas) {
        this.condicoesImpostas = condicoesImpostas;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public LocalDate getDataEmissaoLaudo() {
        return dataEmissaoLaudo;
    }

    public void setDataEmissaoLaudo(LocalDate dataEmissaoLaudo) {
        this.dataEmissaoLaudo = dataEmissaoLaudo;
    }

    public String getNomeCurador() {
        return nomeCurador;
    }

    public void setNomeCurador(String nomeCurador) {
        this.nomeCurador = nomeCurador;
    }

    public String getLocalCumprimento() {
        return localCumprimento;
    }

    public void setLocalCumprimento(String localCumprimento) {
        this.localCumprimento = localCumprimento;
    }

    public String getPrazoMinimoInternacao() {
        return prazoMinimoInternacao;
    }

    public void setPrazoMinimoInternacao(String prazoMinimoInternacao) {
        this.prazoMinimoInternacao = prazoMinimoInternacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MedidaSegurancaAplicadaDTO medidaSegurancaAplicadaDTO = (MedidaSegurancaAplicadaDTO) o;
        if (medidaSegurancaAplicadaDTO.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, medidaSegurancaAplicadaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MedidaSegurancaAplicadaDTO{" + "id=" + id + ", prazoMinimoInternacao='" + prazoMinimoInternacao + "'"
            + ", localCumprimento='" + localCumprimento + "'" + ", condicoesImpostas='" + condicoesImpostas + "'"
            + ", nomeCurador='" + nomeCurador + "'" + ", dataEmissaoLaudo='" + dataEmissaoLaudo + "'" + ", crmMedico='"
            + crmMedico + "'" + '}';
    }
}
