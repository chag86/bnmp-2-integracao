package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.util.ArrayList;
import java.util.List;

import br.com.clientegatewayexterno.dto.pessoa.CampoDominioDTO;

public class NoTipificacaoPenalDTO extends CampoDominioDTO {

    private static final long serialVersionUID = 6085144938007253309L;

    private Long id;

    private String nomePrincipal;

    private String numero;
    
    private TipoNoTipificacaoPenalDTO tipoNoTipificacaoPenal;

    private NoTipificacaoPenalDTO noPai;

    private List<NoTipificacaoPenalDTO> nos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePrincipal() {
        return nomePrincipal;
    }

    public void setNomePrincipal(String nomePrincipal) {
        this.nomePrincipal = nomePrincipal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoNoTipificacaoPenalDTO getTipoNoTipificacaoPenal() {
        return tipoNoTipificacaoPenal;
    }

    public void setTipoNoTipificacaoPenal(TipoNoTipificacaoPenalDTO tipoNoTipificacaoPenal) {
        this.tipoNoTipificacaoPenal = tipoNoTipificacaoPenal;
    }

    public NoTipificacaoPenalDTO getNoPai() {
        return noPai;
    }

    public void setNoPai(NoTipificacaoPenalDTO noPai) {
        this.noPai = noPai;
    }

    public List<NoTipificacaoPenalDTO> getNos() {
        return nos;
    }

    public void setNos(List<NoTipificacaoPenalDTO> nos) {
        this.nos = nos;
    }

}
