package br.com.santbank.conta;

import br.com.santbank.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("-----------------------------------");
        System.out.println("Exibindo extrato da conta Corrente");
        System.out.println("-----------------------------------");
        super.exibirExtratoConta();

    }

}
