package tech.ada.eCommSolidario.model;

import jakarta.persistence.*;

@Entity
public class Benfeitor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idBenfeitor", nullable = false)
    private Long idBenfeitor;

    @Column
    private String nome;
    @Column
    private String tipo;
    @Column
    private String contato;
    @Column
    private String areaInteresse;
    @Column
    private int quantidadeDoacoes;
    @Column
    private String historia;

    @Column
    private String uf;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column
    private String email;

    @Column
    private String telefone;

    // Construtor
    public Benfeitor() {
    }

    // Construtor
    public Benfeitor(long idBenfeitor,
                     String nome,
                     String tipo,
                     String contato,
                     String areaInteresse,
                     int quantidadeDoacoes,
                     String historia) {
        this.idBenfeitor = idBenfeitor;
        this.nome = nome;
        this.tipo = tipo;
        this.contato = contato;
        this.areaInteresse = areaInteresse;
        this.quantidadeDoacoes = quantidadeDoacoes;
        this.historia = historia;
    }

    // Getters e Setters
    public long getIdBenfeitor() {
        return idBenfeitor;
    }

    public void setIdBenfeitor(long idBenfeitor) {
        this.idBenfeitor = idBenfeitor;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getAreaInteresse() {
        return areaInteresse;
    }

    public void setAreaInteresse(String areaInteresse) {
        this.areaInteresse = areaInteresse;
    }

    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    public void setQuantidadeDoacoes(int quantidadeDoacoes) {
        this.quantidadeDoacoes = quantidadeDoacoes;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return "Benfeitor{" +
                "idBenfeitor=" + idBenfeitor +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", contato='" + contato + '\'' +
                ", areaInteresse='" + areaInteresse + '\'' +
                ", quantidadeDoacoes=" + quantidadeDoacoes +
                ", historia='" + historia + '\'' +
                '}';
    }
}