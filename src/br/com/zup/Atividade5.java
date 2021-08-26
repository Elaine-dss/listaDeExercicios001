package br.com.zup;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em fahrenheit que deseja converter: ");
        double fahrenheit = leitor.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit + " graus em fahrenheit equivale a " + celsius + " graus celsius");
    }
}
