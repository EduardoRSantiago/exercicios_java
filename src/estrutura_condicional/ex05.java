/*
Exercício 05
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar
*/

package estrutura_condicional;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;

        System.out.print("Codigo: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: %.2f%n", quantidade * 4.00);
        } else if(codigo == 2) {
            System.out.printf("Total: %.2f%n", quantidade * 4.50);
        } else if (codigo == 3) {
            System.out.printf("Total: %.2f%n", quantidade * 5.00);
        } else  if (codigo == 4) {
            System.out.printf("Total: %.2f%n", quantidade * 2.00);
        } else {
            System.out.printf("Total: %.2f%n", quantidade * 1.50);
        }

    }
}
