/*
Exercício 02
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

package estrutura_condicional;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Numero par.");
        } else {
            System.out.println("Numero impar.");
        }
    }
}
