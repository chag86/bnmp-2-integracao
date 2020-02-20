package br.com.clientegatewayexterno.dto.sca;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the SituacaoSolicitacao entity.
 */
public class SituacaoSolicitacaoDTO implements Serializable {

    private static final long serialVersionUID = -9150783849302290642L;

    public static final long SITUACAO_SOLICITADA = 1;
    public static final long SITUACAO_APROVADA = 2;
    public static final long SITUACAO_REPROVADA = 3;

    public static final String SOLICITADA = "Solicitada";
    public static final String APROVADA = "Aprovada";
    public static final String REPROVADA = "Reprovada";

    private Long id;
    private String nome;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SituacaoSolicitacaoDTO situacaoSolicitacaoDTO = (SituacaoSolicitacaoDTO) o;

        if (!Objects.equals(id, situacaoSolicitacaoDTO.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SituacaoSolicitacaoDTO{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            '}';
    }
}
