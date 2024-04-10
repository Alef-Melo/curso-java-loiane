package exercicios;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numer1 = scan.nextInt();

        System.out.println("Digite outro numero:");
        int numero2 = scan.nextInt();

        var resultado = numer1 + numero2;
        System.out.println("a soma dos dois numeros é: " + resultado);
    }
}
