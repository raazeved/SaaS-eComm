package tech.ada.eCommSolidario.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

public class EstabelecimentosDTO {

    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    @NotBlank(message = "O nome não pode estar em branco.")
    private String nome;

    @Size(min = 3, max = 100, message = "O tipo deve ter entre 3 e 100 caracteres.")
    @NotBlank(message = "O tipo é obrigatório.")
    private String tipo;

    @NotBlank(message = "O endereço é obrigatório.")
    private String endereco;

    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O contato deve seguir o formato (99) 99999-9999.")
    private String contato;

    @Size(max = 255, message = "As necessidades devem ter no máximo 255 caracteres.")
    private String necessidades;

    @Size(max = 500, message = "O histórico deve ter no máximo 500 caracteres.")
    private String historico;

    // Getters e Setters

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
}