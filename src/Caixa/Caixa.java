package Caixa;

import java.util.Scanner;
public class Caixa {
    public double saldo;
    public double credito;
    public double debito;
    Scanner input = new Scanner(System.in);
    public Caixa() {
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }
    public void credito() {
        System.out.println("Quanto R$ de credito você deseja inserir no caixa? :");
        this.credito = input.nextDouble();
        double novoCredito = saldo + credito;
        saldo = novoCredito;
        System.out.println("Seu credito atual é de R$: " + saldo);
    }
    public void debito() {
        System.out.println("Quanto de R$ debito do caixa você retirar? :");
        debito = input.nextDouble();
        if (debito <= saldo) {
            double newSaldo = saldo - debito;
            saldo = newSaldo;
            System.out.println("Seu debito em caixa passou a ser R$: " + newSaldo);
        } else {
            System.out.println("Valor de retirada mair que saldo, não foi possivel realizar a transação ");
        }
    }
}
