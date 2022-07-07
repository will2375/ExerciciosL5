package Pessoa;

import java.util.Scanner;

public class Pessoa {

    Scanner input = new Scanner(System.in);
    public String nome;
    public int idade;
    public int peso = 0;
    public double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void dados() {
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome da pessoa: ");
        nome = input.next();
        System.out.println("Digite a idade da pessoa: ");
        idade = input.nextInt();
        System.out.println("Digite a altura da pessoa: ");
        altura = input.nextDouble();

        System.out.println("quantos anos você quer que ela envelheça?: ");
        int anos = input.nextInt();

        if (idade < 21) {
            for (int i = 1; i <= anos; i++) {
               altura +=  0.5;
                int anosTotal = idade + i;
                System.out.println(" durante esse tempo " + nome + " cresceu: " + altura + " cm e ficou com " + anosTotal + " anos");
            }
        } else {
            System.out.println("A " + nome + " ficou com " + idade + anos + " anos ");
        }
    }
}