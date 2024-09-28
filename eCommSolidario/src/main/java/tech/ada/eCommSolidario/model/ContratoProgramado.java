package tech.ada.eCommSolidario.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity

public class ContratoProgramado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idContrato;
    private int idBenfeitor;
    private int idCampanha;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorDoacao;
    private String tipoDoacao;
    private String status;
    private String observacoes;

    // Construtor
    public ContratoProgramado(int idContrato,
                              int idBenfeitor,
                              int idCampanha,
                              LocalDate dataInicio,
                              LocalDate dataTermino,
                              double valorDoacao,
                              String tipoDoacao,
                              String status,
                              String observacoes) {
        this.idContrato = idContrato;
        this.idBenfeitor = idBenfeitor;
        this.idCampanha = idCampanha;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorDoacao = valorDoacao;
        this.tipoDoacao = tipoDoacao;
        this.status = status;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdBenfeitor() {
        return idBenfeitor;
    }

    public void setIdBenfeitor(int idBenfeitor) {
        this.idBenfeitor = idBenfeitor;
    }

    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorDoacao() {
        return valorDoacao;
    }

    public void setValorDoacao(double valorDoacao) {
        this.valorDoacao = valorDoacao;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "ContratoProgramado{" +
                "idContrato=" + idContrato +
                ", idBenfeitor=" + idBenfeitor +
                ", idCampanha=" + idCampanha +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", valorDoacao=" + valorDoacao +
                ", tipoDoacao='" + tipoDoacao + '\'' +
                ", status='" + status + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}


