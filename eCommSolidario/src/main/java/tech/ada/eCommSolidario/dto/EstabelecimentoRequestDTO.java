package tech.ada.eCommSolidario.dto;

import jakarta.validation.constraints.*;

public class EstabelecimentoRequestDTO {

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
    public @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
    @NotBlank(message = "O nome não pode estar em branco.") String getNome() {
        return nome;
    }

    public void setNome(@Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres.")
                        @NotBlank(message = "O nome não pode estar em branco.") String nome) {
        this.nome = nome;
    }

    public @Size(min = 3, max = 100, message = "O tipo deve ter entre 3 e 100 caracteres.")
    @NotBlank(message = "O tipo é obrigatório.") String getTipo() {
        return tipo;
    }

    public void setTipo(@Size(min = 3, max = 100, message = "O tipo deve ter entre 3 e 100 caracteres.")
                        @NotBlank(message = "O tipo é obrigatório.") String tipo) {
        this.tipo = tipo;
    }

    public @NotBlank(message = "O endereço é obrigatório.") String getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "O endereço é obrigatório.") String endereco) {
        this.endereco = endereco;
    }

    public @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O contato deve seguir o formato (99) 99999-9999.")
    String getContato() {
        return contato;
    }

    public void setContato(@Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O contato deve seguir o formato (99) 99999-9999.")
                           String contato) {
        this.contato = contato;
    }

    public @Size(max = 255, message = "As necessidades devem ter no máximo 255 caracteres.")
    String getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(@Size(max = 255, message = "As necessidades devem ter no máximo 255 caracteres.")
                                String necessidades) {
        this.necessidades = necessidades;
    }

    public @Size(max = 500, message = "O histórico deve ter no máximo 500 caracteres.")
    String getHistorico() {
        return historico;
    }

    public void setHistorico(@Size(max = 500, message = "O histórico deve ter no máximo 500 caracteres.")
                             String historico) {
        this.historico = historico;
    }
}