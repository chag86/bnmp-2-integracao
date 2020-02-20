package br.com.clientegatewayexterno.dto.sca;

import java.io.Serializable;

/**
 * Created by andre on 12/06/17.
 */
public class TipoPendenciaDTO implements Serializable {

    private static final long serialVersionUID = 8782292414575998553L;

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
}
