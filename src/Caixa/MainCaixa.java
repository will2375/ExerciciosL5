package Caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            Caixa caixa = new Caixa();
            caixa.saldo= 1000;
            System.out.println(caixa.saldo);
            System.out.println("Digite 1 caso queira inserir credito ou 2 para retirar");
            int opcao = input.nextInt();

            if (opcao == 1) {
                caixa.credito();
            } else if (opcao == 2) {
                caixa.debito();
            } else {
                System.out.println("Opção invalida, Operação não realizada ");
            }
            System.out.println("Deseja realizar uma nova operação? S/N :");
            String transacao = input.next();
            if (transacao.equalsIgnoreCase("N")) {
                System.out.println("operação encerrada ");
                loop = false;
            }
        }
    }
}