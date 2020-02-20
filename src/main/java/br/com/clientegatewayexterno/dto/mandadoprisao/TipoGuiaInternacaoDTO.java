package br.com.clientegatewayexterno.dto.mandadoprisao;

import br.com.clientegatewayexterno.dto.pessoa.CampoDominioDTO;

/**
 * A DTO for the TipoGuiaInternacao entity.
 */
public class TipoGuiaInternacaoDTO extends CampoDominioDTO {

    private static final long serialVersionUID = -1043025556819448921L;

    public static final Long GUIA_PROVISORIA = 2L;

    public static final Long GUIA_DEFINITIVA = 3L;

}
