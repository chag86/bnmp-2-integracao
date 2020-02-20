package br.com.clientegatewayexterno.dto.pessoa;

import java.util.ArrayList;
import java.util.List;

import br.com.clientegatewayexterno.dto.peca.PecaDTO;

/**
 * A DTO for the Pessoa entity.
 */
public class PessoaDTO extends PessoaGenericoDTO {

    private static final long serialVersionUID = -4972079425130581032L;

    private List<PecaDTO> pecas = new ArrayList<>();

    public List<PecaDTO> getPecas() {
        return pecas;
    }

    public void setPecas(List<PecaDTO> pecas) {
        this.pecas = pecas;
    }

}
