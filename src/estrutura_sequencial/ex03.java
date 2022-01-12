package estrutura_sequencial;/*Exercício 03
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
*/

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int a, b, c, d, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A, B, C, D. Respectivamente: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        resultado = a * b - c * d;
        System.out.println("Diferenca = " + resultado);

        sc.close();
    }
}
