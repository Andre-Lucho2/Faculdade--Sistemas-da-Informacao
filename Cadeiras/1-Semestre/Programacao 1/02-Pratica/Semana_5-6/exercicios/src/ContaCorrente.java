/*
Exercício 12. 
Suponha  a  existência  de  uma  classe  chamada  ContaCorrente,  com  os  atributos número  da  conta  (do  tipo  int) e  saldo  atual  (do  tipo  double).  Sabendo  que  NÃO  FOI  CRIADO  UM CONSTRUTOR NA CLASSE ContaCorrente, apenas os métodos de acesso, escreva o método main para criar 3 contas correntes com as seguintes informações (número, saldo):

Conta 1: 1234, 100.00
Conta 2: 8765, -98.00
Conta 3: 3342, 3445.80

*/

public class ContaCorrente {
  private int numeroConta;
  private double saldoAtual;

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public int getNumeroConta() {
    return this.numeroConta;
  }

  public void setSaldoAtual(double saldoAtual) {
    this.saldoAtual = saldoAtual;
  }

  public double getSaldoAtual() {
    return this.saldoAtual;
  }

  @Override
  public String toString() {
    return ("Conta Corrente: Número: " + this.numeroConta + " | Saldo Atual: " + this.saldoAtual);
  }

}
