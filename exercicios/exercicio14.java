package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade de sua internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de Download: " + tempo);
    }
}
