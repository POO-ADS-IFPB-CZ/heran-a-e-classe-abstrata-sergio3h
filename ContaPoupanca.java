package org.example;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero,double saldo) {
        super(numero, saldo);
    }

    public void reajustar(double percentual) {
        /*double saldoAtual=  this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);*/
        saldo += saldo * percentual;
    }
}
