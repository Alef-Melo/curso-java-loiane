package exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a metragem: ");
        float metro = scan.nextFloat();
        System.out.println("Centimetros: " + metro * 100);

    }
}
