package estrutura_sequencial;/*Exercício 02
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;

        pi = 3.14159;
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A= %.4f",area);

    }
}
