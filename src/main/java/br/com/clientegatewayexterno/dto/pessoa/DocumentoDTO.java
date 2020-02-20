package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo DocumentoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class DocumentoDTO implements Serializable {

    private Long id;

    private String numero;

    private TipoDocumentoDTO tipoDocumento;

    private Long pessoaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoDocumentoDTO getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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

        DocumentoDTO documentoDTO = (DocumentoDTO) o;

        if ( ! Objects.equals(id, documentoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DocumentoDTO{" +
            "id=" + id +
            ", numero='" + numero + "'" +
            '}';
    }
}
