package estrutura_sequencial;/*Exercício 05
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigopeca1, quantidadePeca1,codigopeca2, quantidadePeca2;
        double valorUnitario1, valorUnitario2, resultado;


        System.out.print("Código da primeira peça: ");
        codigopeca1 = sc.nextInt();
        System.out.print("Quantidade de peça: ");
        quantidadePeca1 = sc.nextInt();
        System.out.print("Valor unitario: ");
        valorUnitario1 = sc.nextDouble();

        System.out.print("Código da segunda peça: ");
        codigopeca2 = sc.nextInt();
        System.out.print("Quantidade de peça: ");
        quantidadePeca2 = sc.nextInt();
        System.out.print("Valor unitario: ");
        valorUnitario2 = sc.nextDouble();

        resultado = quantidadePeca1 * valorUnitario1 + quantidadePeca2 * valorUnitario2;

        System.out.printf("Valor a pagar = %.2f ",resultado);
    }
}
