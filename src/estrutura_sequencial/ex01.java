package estrutura_sequencial;/*Exercício 01
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.*/

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, resultado;

        System.out.println("Digite um numero:");
        x = sc.nextInt();

        System.out.println("Digite outro numero:");
        y = sc.nextInt();

        resultado = x + y;
        System.out.println("SOMA: " + resultado);
    }
}
