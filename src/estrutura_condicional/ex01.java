/*
Exercício 01
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

package estrutura_condicional;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite o numero: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Numero negativo.");
        } else {
            System.out.println("Numero não negativo.");
        }
    }
}
