package br.com.santbank.conta;

import br.com.santbank.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("-----------------------------------");
        System.out.println("Exibindo extrato da conta Poupança");
        System.out.println("-----------------------------------");
        super.exibirExtratoConta();

    }
}