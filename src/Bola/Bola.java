package Bola;

import java.util.Scanner;

public class Bola {

    public String marca;
    public String cor;
    public double circuferencia;
    public double velocidade;
    public String material;


    public Bola() {
        this.marca = marca;
        this.cor = cor = "branca";
        this.circuferencia = circuferencia;
        this.velocidade = velocidade;
        this.material = material;
    }

    Scanner input = new Scanner(System.in);

    public String trocarcor() {
        System.out.print("Digite a cor que deseja: ");
        cor = input.next();
        System.out.println("A cor da bola agora é " + cor);
        return cor;
    }
}
