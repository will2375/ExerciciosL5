package Bola;

import Bola.Bola;

import java.util.Scanner;

public class MainBola {

    public static void main(String[] args) {
        Bola bola = new Bola();
        String cor = bola.cor;
        System.out.println("A cor da bola é " + bola.cor);

        String trocar;
        Scanner input = new Scanner(System.in);
        System.out.print("deseja trocar a cor da bola? S/N: ");
        trocar = input.next();

        if (trocar.equalsIgnoreCase("S")) {
            bola.trocarcor();
        }else{
            System.out.println("fim da escolha");
        }
    }
}