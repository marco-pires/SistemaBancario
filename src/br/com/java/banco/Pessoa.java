package br.com.java.banco;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 8529652833683249222L;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
