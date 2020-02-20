package br.com.clientegatewayexterno.dto.mandadoprisao;

import java.io.Serializable;
import java.util.Objects;

import br.com.clientegatewayexterno.dto.mandadoprisao.AlturaDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.BarbaDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.BigodeDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.BiotipoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.BocaDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.CorOlhosDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.CorPeleDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.FormatoOlhosDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.LabiosDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.NarizDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.OrelhasDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.PescocoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.RostoDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.SobrancelhasDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.TestaDTO;
import br.com.clientegatewayexterno.dto.mandadoprisao.TipoCabeloDTO;

/**
 * A DTO for the SinaisMarcas entity.
 */
public class SinaisMarcasDTO implements Serializable {

    private static final long serialVersionUID = -2434459192907405872L;

    private Long id;

    private String outros;

    private AlturaDTO altura;

    private BarbaDTO barba;

    private BigodeDTO bigode;

    private BocaDTO boca;

    private BiotipoDTO biotipo;

    private TipoCabeloDTO tipoCabelo;

    private CorOlhosDTO corOlhos;

    private FormatoOlhosDTO formatoOlhos;

    private CorPeleDTO corPele;

    private LabiosDTO labios;

    private NarizDTO nariz;

    private OrelhasDTO orelhas;

    private PescocoDTO pescoco;

    private RostoDTO rosto;

    private SobrancelhasDTO sobrancelhas;

    private TestaDTO testa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public AlturaDTO getAltura() {
        return altura;
    }

    public void setAltura(AlturaDTO altura) {
        this.altura = altura;
    }

    public BarbaDTO getBarba() {
        return barba;
    }

    public void setBarba(BarbaDTO barba) {
        this.barba = barba;
    }

    public BigodeDTO getBigode() {
        return bigode;
    }

    public void setBigode(BigodeDTO bigode) {
        this.bigode = bigode;
    }

    public BocaDTO getBoca() {
        return boca;
    }

    public void setBoca(BocaDTO boca) {
        this.boca = boca;
    }

    public BiotipoDTO getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(BiotipoDTO biotipo) {
        this.biotipo = biotipo;
    }

    public TipoCabeloDTO getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(TipoCabeloDTO tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }

    public CorOlhosDTO getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(CorOlhosDTO corOlhos) {
        this.corOlhos = corOlhos;
    }

    public FormatoOlhosDTO getFormatoOlhos() {
        return formatoOlhos;
    }

    public void setFormatoOlhos(FormatoOlhosDTO formatoOlhos) {
        this.formatoOlhos = formatoOlhos;
    }

    public CorPeleDTO getCorPele() {
        return corPele;
    }

    public void setCorPele(CorPeleDTO corPele) {
        this.corPele = corPele;
    }

    public LabiosDTO getLabios() {
        return labios;
    }

    public void setLabios(LabiosDTO labios) {
        this.labios = labios;
    }

    public NarizDTO getNariz() {
        return nariz;
    }

    public void setNariz(NarizDTO nariz) {
        this.nariz = nariz;
    }

    public OrelhasDTO getOrelhas() {
        return orelhas;
    }

    public void setOrelhas(OrelhasDTO orelhas) {
        this.orelhas = orelhas;
    }

    public PescocoDTO getPescoco() {
        return pescoco;
    }

    public void setPescoco(PescocoDTO pescoco) {
        this.pescoco = pescoco;
    }

    public RostoDTO getRosto() {
        return rosto;
    }

    public void setRosto(RostoDTO rosto) {
        this.rosto = rosto;
    }

    public SobrancelhasDTO getSobrancelhas() {
        return sobrancelhas;
    }

    public void setSobrancelhas(SobrancelhasDTO sobrancelhas) {
        this.sobrancelhas = sobrancelhas;
    }

    public TestaDTO getTesta() {
        return testa;
    }

    public void setTesta(TestaDTO testa) {
        this.testa = testa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SinaisMarcasDTO sinaisMarcasDTO = (SinaisMarcasDTO) o;
        if (sinaisMarcasDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), sinaisMarcasDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SinaisMarcasDTO{" + "id=" + getId() + ", outros='" + getOutros() + "'" + "}";
    }
}
