package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double celsius, farenheit;
        System.out.println("Digite os graus em Celsius: ");
        celsius = scan.nextDouble();
        farenheit = (celsius * 1.8 + 32);

        System.out.println("Temperatura em farenheit é: " + farenheit);
    }
}
