package br.com.zup;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double valorEmMetros = leitor.nextDouble();

        double valorEmCentimetros = valorEmMetros * 100;

        System.out.println(valorEmMetros + " metros convertido para centímetros fica " + valorEmCentimetros + "cm");
    }
}
