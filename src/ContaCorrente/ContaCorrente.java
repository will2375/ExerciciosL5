package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {

    Scanner input = new Scanner(System.in);
    public int conta;
    public String nomeCorrentista;
    public double saldo;


    public ContaCorrente() {
        this.conta = 143;
        this.nomeCorrentista = "Claudio de Souza";
        this.saldo = saldo;
        System.out.println("conta: "+ conta + ", Cliente: "+ nomeCorrentista);
    }
    public void transação() {

        System.out.println("Digite 1 se a sua opção é saque ou digite 2 para deposito: ");
        int opçao = input.nextInt();
        if (opçao ==1) {
            System.out.println("Quanto deseja sacar?: ");
            double valorSaque = input.nextDouble();
            System.out.println("O valor do saque é de: " + valorSaque);
        }else if(opçao == 2){
            System.out.println("Qual o valor a ser depositado?: ");
            double valorDeposito = input.nextDouble();
            System.out.println("O valor depositado é de: " + valorDeposito);
        }else{
            System.out.println(" opção invalida ");
        }
    }
}

