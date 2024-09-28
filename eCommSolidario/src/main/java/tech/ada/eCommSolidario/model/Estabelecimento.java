package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idEstabelecimento;
    private String nome;
    private String tipo;
    private String endereco;
    private String contato;
    private String necessidades;
    private String historico;

    // Construtor
    public Estabelecimento(int idEstabelecimento,
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
    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
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
