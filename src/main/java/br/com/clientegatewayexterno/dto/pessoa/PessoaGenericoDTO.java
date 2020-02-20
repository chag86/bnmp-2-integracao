package br.com.clientegatewayexterno.dto.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Size;

import br.com.clientegatewayexterno.dto.mandadoprisao.SinaisMarcasDTO;
import br.com.clientegatewayexterno.util.ToStringUtil;

/**
 * Created by jonathan on 13/07/17.
 */
public class PessoaGenericoDTO implements Serializable {

    private static final long serialVersionUID = -3385572370734750740L;

    private Long id;

    private Boolean ativo;

    private String numeroIndividuo;

    @Size(max = 150)
    private String justificativa;

    private StatusPessoaDTO statusPessoa;

    private DadosGeraisPessoaDTO dadosGeraisPessoa;

    private List<EnderecoDTO> enderecos = new ArrayList<>();

    private List<OutrasAlcunhasDTO> outrasAlcunhas = new ArrayList<>();

    private List<OutrosNomesDTO> outrosNomes = new ArrayList<>();
    
    private List<NomePaiDTO> nomePai = new ArrayList<>();
    
    private List<NomeMaeDTO> nomeMae = new ArrayList<>();

    private List<DataNascimentoDTO> dataNascimento = new ArrayList<>();

    private List<DocumentoDTO> documentos = new ArrayList<>();

    private List<FotoDTO> fotos = new ArrayList<>();

    private EstadoDTO ufCustodia;

    private SinaisMarcasDTO sinaisMarcas;

    public String getNumeroIndividuoFormatado() {
        return ToStringUtil.mascaraRegistroJudiciarioIndividual(this.numeroIndividuo);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNumeroIndividuo() {
        return numeroIndividuo;
    }

    public void setNumeroIndividuo(String numeroIndividuo) {
        this.numeroIndividuo = numeroIndividuo;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public StatusPessoaDTO getStatusPessoa() {
        return statusPessoa;
    }

    public void setStatusPessoa(StatusPessoaDTO statusPessoa) {
        this.statusPessoa = statusPessoa;
    }

    public DadosGeraisPessoaDTO getDadosGeraisPessoa() {
        return dadosGeraisPessoa;
    }

    public void setDadosGeraisPessoa(DadosGeraisPessoaDTO dadosGeraisPessoa) {
        this.dadosGeraisPessoa = dadosGeraisPessoa;
    }

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public List<OutrasAlcunhasDTO> getOutrasAlcunhas() {
        return outrasAlcunhas;
    }

    public void setOutrasAlcunhas(List<OutrasAlcunhasDTO> outrasAlcunhas) {
        this.outrasAlcunhas = outrasAlcunhas;
    }

    public List<OutrosNomesDTO> getOutrosNomes() {
        return outrosNomes;
    }

    public void setOutrosNomes(List<OutrosNomesDTO> outrosNomes) {
        this.outrosNomes = outrosNomes;
    }

    public List<NomePaiDTO> getNomePai() {
        return nomePai;
    }

    public void setNomePai(List<NomePaiDTO> nomePai) {
        this.nomePai = nomePai;
    }

    public List<NomeMaeDTO> getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(List<NomeMaeDTO> nomeMae) {
        this.nomeMae = nomeMae;
    }

    public List<DataNascimentoDTO> getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(List<DataNascimentoDTO> dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<DocumentoDTO> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoDTO> documentos) {
        this.documentos = documentos;
    }

    public List<FotoDTO> getFotos() {
        return fotos;
    }

    public void setFotos(List<FotoDTO> fotos) {
        this.fotos = fotos;
    }

    public EstadoDTO getUfCustodia() {
        return ufCustodia;
    }

    public void setUfCustodia(EstadoDTO ufCustodia) {
        this.ufCustodia = ufCustodia;
    }

    public SinaisMarcasDTO getSinaisMarcas() {
        return sinaisMarcas;
    }

    public void setSinaisMarcas(SinaisMarcasDTO sinaisMarcas) {
        this.sinaisMarcas = sinaisMarcas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PessoaGenericoDTO pessoaGenericoDTO = (PessoaGenericoDTO) o;
        if (pessoaGenericoDTO.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, pessoaGenericoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PessoaDTO{" + "id=" + id + ", ativo='" + ativo + "'" + ", numeroIndividuo='" + numeroIndividuo + "'"
            + ", justificativa='" + justificativa + "'" + '}';
    }
}
