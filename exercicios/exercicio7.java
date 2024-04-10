package exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        double area, dobro;
        System.out.println("Digite a area do quadrado: ");
        area = scan.nextDouble();
        dobro = area * 2;
        System.out.println("O dobro é: " + dobro);

    }
}
