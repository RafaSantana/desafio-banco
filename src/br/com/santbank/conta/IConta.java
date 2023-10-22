package br.com.santbank.conta;

public interface IConta {
    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void exibirExtrato();
}
