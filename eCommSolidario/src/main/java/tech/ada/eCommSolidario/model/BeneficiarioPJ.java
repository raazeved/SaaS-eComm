package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;
@Entity
public class BeneficiarioPJ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBeneficiarioPJ", nullable = false)
    private Long idBeneficiarioPJ;

    private String nomeInstituicao;
    private String tipoBeneficio;
    private String endereco;
    private String necessidades;
    private String historicoAjuda;

    // Construtor
    public BeneficiarioPJ(Long idBeneficiarioPJ,
                                String nomeInstituicao,
                                String tipoBeneficio,
                                String endereco,
                                String necessidades,
                                String historicoAjuda) {
        this.idBeneficiarioPJ = idBeneficiarioPJ;
        this.nomeInstituicao = nomeInstituicao;
        this.tipoBeneficio = tipoBeneficio;
        this.endereco = endereco;
        this.necessidades = necessidades;
        this.historicoAjuda = historicoAjuda;
    }

    // Getters e Setters
    public Long getIdBeneficiario() {
        return idBeneficiarioPJ;
    }

    public void setIdBeneficiario(Long idBeneficiarioPJ) {
        this.idBeneficiarioPJ = idBeneficiarioPJ;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(String tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(String necessidades) {
        this.necessidades = necessidades;
    }

    public String getHistoricoAjuda() {
        return historicoAjuda;
    }

    public void setHistoricoAjuda(String historicoAjuda) {
        this.historicoAjuda = historicoAjuda;
    }

    @Override
    public String toString() {
        return "BeneficiarioJuridico{" +
                "idBeneficiario=" + idBeneficiarioPJ +
                ", nomeInstituicao='" + nomeInstituicao + '\'' +
                ", tipoBeneficio='" + tipoBeneficio + '\'' +
                ", endereco='" + endereco + '\'' +
                ", necessidades='" + necessidades + '\'' +
                ", historicoAjuda='" + historicoAjuda + '\'' +
                '}';
    }
}
