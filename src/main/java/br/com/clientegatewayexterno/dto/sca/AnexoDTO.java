package br.com.clientegatewayexterno.dto.sca;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A AnexoDTO.
 */
public class AnexoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private String fileContentType;

    private byte[] file;

    private Integer tamanho;

    private LocalDate dataInclusao;

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

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnexoDTO anexo = (AnexoDTO) o;
        if (anexo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), anexo.getId());
    }

    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public String toString() {
        return "Anexo{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", fileContentType='" + fileContentType + "'" +
            ", tamanho='" + getTamanho() + "'" +
            ", dataInclusao='" + getDataInclusao() + "'" +
            "}";
    }
}
