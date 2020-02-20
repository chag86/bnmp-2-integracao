package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;
import br.com.clientegatewayexterno.dto.sca.UsuarioDTO;

/**
 * Created by jonathan on 11/07/17.
 */
public class OutrosNomesAlcunhasDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @Size(max = 150)
    private String nome;

    private UsuarioDTO usuario;

    private OrgaoDTO orgao;

    private Long pessoaId;

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

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public OrgaoDTO getOrgao() {
        return orgao;
    }

    public void setOrgao(OrgaoDTO orgao) {
        this.orgao = orgao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OutrosNomesAlcunhasDTO outrosNomesAlcunhasDTO = (OutrosNomesAlcunhasDTO) o;
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
