package exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float valorPorHora, salario, horaPorMes;
        System.out.println("Digite o quanto você ganha por hora: ");
        valorPorHora = scan.nextFloat();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        horaPorMes = scan.nextFloat();
        salario = valorPorHora * horaPorMes;

        System.out.println("Seu salario no mês é de: " + salario);

    }
}
