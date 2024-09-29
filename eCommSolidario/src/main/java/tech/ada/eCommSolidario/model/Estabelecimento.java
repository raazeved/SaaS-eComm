package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEstabelecimento", nullable = false)
    private Long idEstabelecimento;

    @Column
    private String nome;

    @Column
    private String tipo;

    @Column
    private String endereco;

    @Column
    private String contato;

    @Column
    private String necessidades;

    @Column
    private String historico;

    @Column
    private String uf;

    @Column(unique = true, nullable = false)
    private String cnpj;

    @Column
    private String email;

    @Column
    private String telefone;


    // Construtor
    public Estabelecimento(Long idEstabelecimento,
                           String nome,
                           String tipo,
                           String endereco,
                           String contato,
                           String necessidades,
                           String historico) {
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.tipo = tipo;
        this.endereco = endereco;
        this.contato = contato;
        this.necessidades = necessidades;
        this.historico = historico;
    }

    // Getters e Setters
    public Long getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Long idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(String necessidades) {
        this.necessidades = necessidades;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }


    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "idEstabelecimento=" + idEstabelecimento +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                ", necessidades='" + necessidades + '\'' +
                ", historico='" + historico + '\'' +
                '}';
    }
}
