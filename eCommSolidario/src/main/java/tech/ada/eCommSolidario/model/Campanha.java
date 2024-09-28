package tech.ada.eCommSolidario.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Campanha {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCampanha", nullable = false)
    private Long idCampanha;

    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String descricao;
    private String objetivo;
    private String status;

    // Construtor
    public Campanha(Long idCampanha, String nome, LocalDate dataInicio, LocalDate dataTermino, String descricao, String objetivo, String status) {
        this.idCampanha = idCampanha;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.status = status;
    }

    // Getters e Setters
    public Long getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(Long idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Campanha{" +
                "idCampanha=" + idCampanha +
                ", nome='" + nome + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", descricao='" + descricao + '\'' +
                ", objetivo='" + objetivo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}