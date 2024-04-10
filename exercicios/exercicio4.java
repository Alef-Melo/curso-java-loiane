package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        float primeiraNota = scan.nextFloat();

        System.out.println("Digite sua segunda nota:");
        float segundaNota = scan.nextFloat();

        System.out.println("Digite sua terceira nota:");
        float terceiraNota = scan.nextFloat();

        System.out.println("Digite sua quarta nota:");
        float quartaNota = scan.nextFloat();

        float media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/2;
        System.out.println("a media é:" + media);

    }
}
