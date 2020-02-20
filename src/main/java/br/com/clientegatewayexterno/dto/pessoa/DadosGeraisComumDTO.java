package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by jonathan on 11/07/17.
 */
public class DadosGeraisComumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    @Size(max = 150)
    private String nome;

    @NotNull
    @Size(max = 150)
    private String alcunha;

    @NotNull
    @Size(max = 150)
    private String nomePai;

    @NotNull
    @Size(max = 150)
    private String nomeMae;

    @NotNull
    private SexoDTO sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public SexoDTO getSexo() {
        return sexo;
    }

    public void setSexo(SexoDTO sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosGeraisComumDTO that = (DadosGeraisComumDTO) o;
        if (that.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
