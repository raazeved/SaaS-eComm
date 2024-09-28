package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;
@Entity
public class BeneficiariosJurídicos{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBeneficiario", nullable = false)
    private Long idBeneficiario;

    @Column
    private int idBeneficiario;
    private String nomeInstituicao;
    private String tipoBeneficio;
    private String endereco;
    private String necessidades;
    private String historicoAjuda;

    // Construtor
    public BeneficiarioJuridico(int idBeneficiario,
                                String nomeInstituicao,
                                String tipoBeneficio,
                                String endereco,
                                String necessidades,
                                String historicoAjuda) {
        this.idBeneficiario = idBeneficiario;
        this.nomeInstituicao = nomeInstituicao;
        this.tipoBeneficio = tipoBeneficio;
        this.endereco = endereco;
        this.necessidades = necessidades;
        this.historicoAjuda = historicoAjuda;
    }

    // Getters e Setters
    public int getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(int idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
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
                "idBeneficiario=" + idBeneficiario +
                ", nomeInstituicao='" + nomeInstituicao + '\'' +
                ", tipoBeneficio='" + tipoBeneficio + '\'' +
                ", endereco='" + endereco + '\'' +
                ", necessidades='" + necessidades + '\'' +
                ", historicoAjuda='" + historicoAjuda + '\'' +
                '}';
    }
}
