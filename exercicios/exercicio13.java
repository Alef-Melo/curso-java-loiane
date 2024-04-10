package exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float valorPorHora, salario, horaPorMes;
        System.out.println("Digite o quanto você ganha por hora: ");
        valorPorHora = scan.nextFloat();

        System.out.println("Digite quantas horas você trabalha por mês: ");
        horaPorMes = scan.nextFloat();
        double salarioBruto = valorPorHora * horaPorMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Seu salario bruto no mês é de: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total Desconto: " + totalDesconto);
        System.out.println("Salario Liquido: " + salarioLiquido);

        }
    }
