package exercicios;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int Pnumero = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int Snumero = scan.nextInt();

        if (Pnumero > Snumero){
            System.out.println("O maior numero é: " + Pnumero);
        } else if (Snumero > Pnumero) {
            System.out.println("o maior numero é: " + Snumero);
            
        }else {
            System.out.println("Os numeros são iguais. ");
        }


    }
}
