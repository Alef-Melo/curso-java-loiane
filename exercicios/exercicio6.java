package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double area, raio;
        System.out.println("Digite o raio do circulo: ");
        raio = scan.nextDouble();
        area = 2 * Math.PI * raio;
        System.out.println("A area do circulo: " + area);
    }
}
