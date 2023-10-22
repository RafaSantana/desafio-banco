package br.com.santbank.conta;

import br.com.santbank.cliente.Cliente;

public abstract class Conta implements IConta {

    protected int agencia;
    private int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipoConta;

    protected static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        if (this instanceof ContaCorrente) {
            this.numero = SEQUENCIAL++;
            this.tipoConta = "C" + this.numero;
            this.cliente = cliente;
        }

        if (this instanceof ContaPoupanca) {
            this.numero = SEQUENCIAL++;
            this.tipoConta = "P" + this.numero;
            this.cliente = cliente;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado");
        this.exibirExtrato();
    }

    @Override
    public boolean sacar(double valor) {

        if ((this.saldo <= 0) || (this.saldo < valor)) {
            System.out.println("Saldo insuficiente para Saque.");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado");
            this.exibirExtrato();
            return true;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            this.exibirExtrato();
        }

    }

    protected void exibirExtratoConta() {
        System.out.format("Cliente: %s%n", this.cliente.getNome());
        System.out.format("Agencia: %d%n", this.agencia);
        System.out.format("Numero: %s%n", this.tipoConta);
        System.out.format("Saldo: %.2f%n%n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

}
