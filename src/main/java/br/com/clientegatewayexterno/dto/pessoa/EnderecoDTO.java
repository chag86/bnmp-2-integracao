package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo EnderecoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class EnderecoDTO implements Serializable {

	private static final long serialVersionUID = 6191983913543338709L;

	private Long id;

    private String logradouro;

    private String bairro;

    private Integer numero;

    private String complemento;

    private String cep;

    private MunicipioDTO municipio;

    private EstadoDTO estado;

    private PaisDTO pais;

    private Long pessoaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public MunicipioDTO getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioDTO municipio) {
		this.municipio = municipio;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}

	public PaisDTO getPais() {
		return pais;
	}

	public void setPais(PaisDTO pais) {
		this.pais = pais;
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

        EnderecoDTO enderecoDTO = (EnderecoDTO) o;

        if ( ! Objects.equals(id, enderecoDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EnderecoDTO{" +
            "id=" + id +
            ", logradouro='" + logradouro + "'" +
            ", bairro='" + bairro + "'" +
            ", numero='" + numero + "'" +
            ", complemento='" + complemento + "'" +
            ", cep='" + cep + "'" +
            '}';
    }
}
