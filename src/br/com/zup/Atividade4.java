package br.com.zup;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas que você trabalhou neste mês: ");
        double horasTrabalhadas = leitor.nextDouble();

        System.out.print("Digite quanto você ganha por hora trabalhada: ");
        double ganhoPorHora = leitor.nextDouble();

        double salario = ganhoPorHora * horasTrabalhadas;

        System.out.println("Esse mês você trabalhou " + horasTrabalhadas + " horas, ganhando " + ganhoPorHora + " por hora trabalhada.");
        System.out.println("Seu salário esse mês será de R$" + salario);
    }
}
