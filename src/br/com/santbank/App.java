package br.com.santbank;

import br.com.santbank.cliente.Cliente;
import br.com.santbank.conta.ContaCorrente;
import br.com.santbank.conta.ContaPoupanca;
import br.com.santbank.conta.IConta;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João");

        IConta cc = new ContaCorrente(cliente);
        IConta cp = new ContaPoupanca(cliente);

        cc.depositar(200);
        cc.sacar(100);
        cc.transferir(200, cp);

    }
}
