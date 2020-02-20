package br.com.clientegatewayexterno.dto.guiarecolhimento;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.clientegatewayexterno.dto.peca.PecaDTO;

/** 
 * Classe para objetos do tipo GuiaExecucaoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class GuiaExecucaoDTO extends PecaDTO implements Serializable {

	private static final long serialVersionUID = -3820528613618218081L;

    private GuiaRecolhimentoDTO guiaRecolhimento;

    private List<TipificacaoPenalGuiaExecucaoDTO> tipificacoesPenaisGuiasExecucao;

    public GuiaRecolhimentoDTO getGuiaRecolhimento() {
		return guiaRecolhimento;
	}

	public void setGuiaRecolhimento(GuiaRecolhimentoDTO guiaRecolhimento) {
		this.guiaRecolhimento = guiaRecolhimento;
	}

    public List<TipificacaoPenalGuiaExecucaoDTO> getTipificacoesPenaisGuiasExecucao() {
        return tipificacoesPenaisGuiasExecucao;
    }

    public void setTipificacoesPenaisGuiasExecucao(List<TipificacaoPenalGuiaExecucaoDTO> tipificacoesPenaisGuiasExecucao) {
        this.tipificacoesPenaisGuiasExecucao = tipificacoesPenaisGuiasExecucao;
    }
    
}
