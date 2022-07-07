package Carro;

import java.util.Scanner;

public class Carro {

Scanner input = new Scanner(System.in);
    public int quantidadesPortas;
    public String modelo;
    public String marca;
    public double potencia= 2.0;


    public Carro() {
        this.quantidadesPortas = 4;
        this.modelo = "Argo";
        this.marca = "fiat";
        this.potencia = potencia;
        System.out.println("o carro tem: " +quantidadesPortas + " portas ,  o modelo é um: " + modelo + ", O fabricante é a: " + marca +", O motor é " +  potencia);
    }

    public void ligarCarro(){
        System.out.println("Você deseja ligar o carro? S/N ");
        String ligar = input.next();

        if(ligar.equalsIgnoreCase("S")){
            System.out.println(" Carro ligado, bom passeio ");
        }else{
            System.out.println("Carro desligado, boa caminhada");
        }
    }
}
