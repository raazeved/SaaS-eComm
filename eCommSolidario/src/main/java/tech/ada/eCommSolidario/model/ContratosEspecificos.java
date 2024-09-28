package tech.ada.eCommSolidario.model;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class ContratosEspecificos {
    private int idContratoEspecifico;
    private int idBenfeitor;
    private Integer idBeneficiarioFisico; // Opcional
    private Integer idBeneficiarioJuridico; // Opcional
    private int idEstabelecimento;
    private int idCampanha;
    private int idDoacao;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private LocalDate dataRepactuacao;
    private double valorContrato;
    private String status;
    private String observacoes;

    // Construtor
    public ContratosEspecificos(int idContratoEspecifico,
                                int idBenfeitor,
                                Integer idBeneficiarioFisico,
                                Integer idBeneficiarioJuridico,
                                int idEstabelecimento,
                                int idCampanha,
                                int idDoacao,
                                LocalDate dataInicio,
                                LocalDate dataTermino,
                                LocalDate dataRepactuacao,
                                double valorContrato,
                                String status,
                                String observacoes) {
        this.idContratoEspecifico = idContratoEspecifico;
        this.idBenfeitor = idBenfeitor;
        this.idBeneficiarioFisico = idBeneficiarioFisico;
        this.idBeneficiarioJuridico = idBeneficiarioJuridico;
        this.idEstabelecimento = idEstabelecimento;
        this.idCampanha = idCampanha;
        this.idDoacao = idDoacao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.dataRepactuacao = dataRepactuacao;
        this.valorContrato = valorContrato;
        this.status = status;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getIdContratoEspecifico() {
        return idContratoEspecifico;
    }

    public void setIdContratoEspecifico(int idContratoEspecifico) {
        this.idContratoEspecifico = idContratoEspecifico;
    }

    public int getIdBenfeitor() {
        return idBenfeitor;
    }

    public void setIdBenfeitor(int idBenfeitor) {
        this.idBenfeitor = idBenfeitor;
    }

    public Integer getIdBeneficiarioFisico() {
        return idBeneficiarioFisico;
    }

    public void setIdBeneficiarioFisico(Integer idBeneficiarioFisico) {
        this.idBeneficiarioFisico = idBeneficiarioFisico;
    }

    public Integer getIdBeneficiarioJuridico() {
        return idBeneficiarioJuridico;
    }

    public void setIdBeneficiarioJuridico(Integer idBeneficiarioJuridico) {
        this.idBeneficiarioJuridico = idBeneficiarioJuridico;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public int getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(int idCampanha) {
        this.idCampanha = idCampanha;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
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

    public LocalDate getDataRepactuacao() {
        return dataRepactuacao;
    }

    public void setDataRepactuacao(LocalDate dataRepactuacao) {
        this.dataRepactuacao = dataRepactuacao;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
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
        return "ContratoEspecifico{" +
                "idContratoEspecifico=" + idContratoEspecifico +
                ", idBenfeitor=" + idBenfeitor +
                ", idBeneficiarioFisico=" + idBeneficiarioFisico +
                ", idBeneficiarioJuridico=" + idBeneficiarioJuridico +
                ", idEstabelecimento=" + idEstabelecimento +
                ", idCampanha=" + idCampanha +
                ", idDoacao=" + idDoacao +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", dataRepactuacao=" + dataRepactuacao +
                ", valorContrato=" + valorContrato +
                ", status='" + status + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
