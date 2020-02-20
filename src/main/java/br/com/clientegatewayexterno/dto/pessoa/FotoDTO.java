package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/** 
 * Classe para objetos do tipo FotoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class FotoDTO implements Serializable {

	private static final long serialVersionUID = -7084506778858870131L;

	private Long id;

    @NotNull
    //@Lob
    private byte[] file;

    private String fileContentType;

    private LocalDate dataInclusao;

    private LocalDate dataFoto;

    @NotNull
    private String origem;

    private Long pessoaId;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    public LocalDate getDataFoto() {
        return dataFoto;
    }

    public void setDataFoto(LocalDate dataFoto) {
        this.dataFoto = dataFoto;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FotoDTO fotoDTO = (FotoDTO) o;

        if ( ! Objects.equals(id, fotoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "FotoDTO{" +
            "id=" + id +
            ", foto='" + file + "'" +
            ", dataInclusao='" + dataInclusao + "'" +
            ", dataFoto='" + dataFoto + "'" +
            ", origem='" + origem + "'" +
            '}';
    }
}
