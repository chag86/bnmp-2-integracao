package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.util.Objects;

import br.com.clientegatewayexterno.dto.peca.PecaDTO;
import br.com.clientegatewayexterno.dto.pessoa.StatusDTO;
import br.com.clientegatewayexterno.dto.sca.OrgaoDTO;

/**
 * A DTO for the OutrasPecas entity.
 */
public class OutrasPecasDTO implements Serializable {

    private static final long serialVersionUID = -2947849912427299461L;

    private Long id;

    private OrgaoDTO orgao;

    private Long idPecaPai;

    private PecaDTO peca;

    private StatusDTO status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrgaoDTO getOrgao() {
        return orgao;
    }

    public void setOrgao(OrgaoDTO orgao) {
        this.orgao = orgao;
    }

    public Long getIdPecaPai() {
        return idPecaPai;
    }

    public void setIdPecaPai(Long idPecaPai) {
        this.idPecaPai = idPecaPai;
    }

    public PecaDTO getPeca() {
        return peca;
    }

    public void setPeca(PecaDTO peca) {
        this.peca = peca;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OutrasPecasDTO outrasPecasDTO = (OutrasPecasDTO) o;
        if (outrasPecasDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), outrasPecasDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OutrasPecasDTO{" + "id=" + getId() + "}";
    }
}
