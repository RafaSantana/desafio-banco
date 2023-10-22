package br.com.santbank.banco;

import java.util.List;

import br.com.santbank.conta.Conta;

public class Banco {

    private static final String NOME = "SantBank";
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
