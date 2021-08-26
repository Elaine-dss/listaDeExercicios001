package br.com.zup;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = leitor.nextFloat();
        System.out.print("Digite a quarta nota: ");
        float nota4 = leitor.nextFloat();

        float somaDasNotas = nota1 + nota2 + nota3 + nota4;
        float mediaAritmetica = somaDasNotas / 4;

        System.out.println("Suas notas nesse bimestre foram respectivamente "
                + nota1 + ", "
                + nota2 + ", "
                + nota3 + " e "
                + nota4 + ".");
        System.out.println("Sua média final é " + mediaAritmetica);
    }
}
