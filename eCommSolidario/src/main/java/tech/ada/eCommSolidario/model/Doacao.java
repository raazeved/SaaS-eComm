package tech.ada.eCommSolidario.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity

public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idDoacao;
    private int idBenfeitor;
    private int idEstabelecimento;
    private String tipoDoacao;
    private int quantidade;
    private LocalDate dataDoacao;
    private String observacoes;

    // Construtor
    public Doacao(int idDoacao,
                  int idBenfeitor,
                  int idEstabelecimento,
                  String tipoDoacao,
                  int quantidade,
                  LocalDate dataDoacao,
                  String observacoes) {

        this.idDoacao = idDoacao;
        this.idBenfeitor = idBenfeitor;
        this.idEstabelecimento = idEstabelecimento;
        this.tipoDoacao = tipoDoacao;
        this.quantidade = quantidade;
        this.dataDoacao = dataDoacao;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public int getIdBenfeitor() {
        return idBenfeitor;
    }

    public void setIdBenfeitor(int idBenfeitor) {
        this.idBenfeitor = idBenfeitor;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "idDoacao=" + idDoacao +
                ", idBenfeitor=" + idBenfeitor +
                ", idEstabelecimento=" + idEstabelecimento +
                ", tipoDoacao='" + tipoDoacao + '\'' +
                ", quantidade=" + quantidade +
                ", dataDoacao=" + dataDoacao +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
