package Quadrado;

import java.util.Scanner;

public class Quadrado {

    public double lado;


    public Quadrado() {
        this.lado = lado;
    }

    Scanner input = new Scanner(System.in);

    public double calculo() {
        System.out.println("Informe o tamanho do lado do quadrado em cm: ");
        lado = input.nextDouble();
        System.out.println("conforme o valor do lado de " + lado + " cm " + " A area do quadrado é de: " + (lado * lado) + " cm");
        return calculo();
    }

}

