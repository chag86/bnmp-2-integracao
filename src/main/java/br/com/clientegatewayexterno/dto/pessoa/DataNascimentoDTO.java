package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.dto.sca.UsuarioDTO;
import br.com.clientegatewayexterno.serializers.CustomLocalDateDeserializer;
import br.com.clientegatewayexterno.serializers.CustomLocalDateSerializer;

public class DataNascimentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private UsuarioDTO usuario;
    
    private Long id;

    private OrgaoDTO orgao;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    @NotNull
    private LocalDate dataNascimento;
    
    private Long pessoaId;

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public OrgaoDTO getOrgao() {
        return orgao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setOrgao(OrgaoDTO orgao) {
        this.orgao = orgao;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DataNascimentoDTO outrosNomesAlcunhasDTO = (DataNascimentoDTO) o;
        if (outrosNomesAlcunhasDTO.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, outrosNomesAlcunhasDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
