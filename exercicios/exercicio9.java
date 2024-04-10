package exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double farenheit, celsius;
        System.out.println("Digite os graus em Farenheit: ");
        farenheit = scan.nextDouble();
        celsius = (5 * (farenheit - 32)/9);

        System.out.println("Temperatura em celsius é: " + celsius);

    }
}
