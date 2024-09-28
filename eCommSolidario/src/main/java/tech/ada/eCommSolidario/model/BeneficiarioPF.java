package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;

@Entity
public class BeneficiarioPF {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBeneficiarioPF", nullable = false)
    private Long idBeneficiarioPF;

    private String nome;
    private int idade;
    private String genero;
    private String situacaoFamiliar;
    private String endereco;
    private String necessidades;
    private String historia;

    // Construtor
    public BeneficiarioPF(Long idBeneficiarioPF, String nome,
                              int idade,
                              String genero,
                              String situacaoFamiliar,
                              String endereco,
                              String necessidades,
                              String historia) {
        this.idBeneficiarioPF = idBeneficiarioPF;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.situacaoFamiliar = situacaoFamiliar;
        this.endereco = endereco;
        this.necessidades = necessidades;
        this.historia = historia;
    }

    // Getters e Setters
    public Long getIdBeneficiario() {
        return idBeneficiarioPF;
    }

    public void setIdBeneficiario(Long idBeneficiario) {
        this.idBeneficiarioPF = idBeneficiarioPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
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

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        return "BeneficiarioFisico{" +
                "idBeneficiario=" + idBeneficiarioPF +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", situacaoFamiliar='" + situacaoFamiliar + '\'' +
                ", endereco='" + endereco + '\'' +
                ", necessidades='" + necessidades + '\'' +
                ", historia='" + historia + '\'' +
                '}';
    }
}