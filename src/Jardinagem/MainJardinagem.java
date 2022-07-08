package Jardinagem;

import java.util.Scanner;

public class MainJardinagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Jardinagem jardinagem = new Jardinagem();

        System.out.println("Digite 1 Caso deseje plantar grama ou 2 caso deseje cortar grama");
        int opcao = input.nextInt();
        if(opcao ==1){
            jardinagem.usarAdubo();
        } else if (opcao == 2) {
            jardinagem.precoCortarGrama();
        }else{
            System.out.println("Opção invalida");
        }

    }
}
