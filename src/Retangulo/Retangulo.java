package Retangulo;

import java.util.Scanner;

public class Retangulo {
    Scanner input = new Scanner(System.in);
    public double comprimento;
    public double largura;


    public Retangulo() {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void calculoRetangulo(){
        System.out.println("Qual a medida em cm da base do retangulo: ");
        double base = input.nextDouble();
        System.out.println("Qual a medida em cm da altura do retângulo: ");
        double altura = input.nextDouble();
        System.out.println("A area do retângulo é: " + base * altura + " cm " );
        System.out.println(" A base do retangulo é: " + base + " altura do retangulo é: " + altura);
    }
}
