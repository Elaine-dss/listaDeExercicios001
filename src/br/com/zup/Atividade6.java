package br.com.zup;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas que você trabalhou neste mês: ");
        double horasTrabalhadas = leitor.nextDouble();

        System.out.print("Digite quanto você ganha por hora trabalhada: ");
        double ganhoPorHora = leitor.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;

        double impostoDeRenda = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;

        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas);
        System.out.println("Valor ganho por hora trabalhada: " + ganhoPorHora);
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto do imposto de renda: R$" + impostoDeRenda);
        System.out.println("Desconto do INSS: R$" + inss);
        System.out.println("Desconto do sindicato: R$" + sindicato);
        System.out.println("Salário líquido: R$" + salarioLiquido);
    }
}
