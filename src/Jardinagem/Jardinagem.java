package Jardinagem;

import java.util.Scanner;

public class Jardinagem {

    Scanner input = new Scanner(System.in);
    public String nomeJardim;
    public double qtdMetros;
    public double qtdPlantas;
    public double qtdMetrosGrama;
    public double kilosAdubo;
    public double valorAdubo;
    public double valorMetroGrama;
    public double valorCorteGrama;

    public Jardinagem() {
        this.nomeJardim = "Zup Jardim";
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.kilosAdubo = kilosAdubo;
        this.valorAdubo = 20;
        this.valorMetroGrama = 30;
        this.valorCorteGrama = 50;
        System.out.println("Bem vindo ao " + nomeJardim + " temos adubo no valor de: " + valorAdubo + " Reais o kilo e o valor do nosso corte de grama é de  " + valorCorteGrama + " Reais");
    }

    public void usarAdubo() {
        System.out.println("Quantos metros de grama você deseja plantar?: ");
        qtdMetrosGrama = input.nextDouble();
        double adubo = qtdMetrosGrama / 20;
        System.out.println("Voce deve usar " + adubo + " gramas de adubo o valor de adubo será de: " + (adubo * valorAdubo) + " Reais  e da grama sera de: " + (qtdMetrosGrama * valorMetroGrama) + " Reais");
    }

    public void precoCortarGrama() {
        System.out.println("Quantos metros de grama você deseja cortar?: ");
        qtdMetros = input.nextDouble();
        System.out.println("O valor do corte da grama saira: " + qtdMetros * valorCorteGrama + " Reais");
    }

}
