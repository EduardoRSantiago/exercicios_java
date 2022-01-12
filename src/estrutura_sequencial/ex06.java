package estrutura_sequencial;/* Exercício 06
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B
*/

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        double a, b, c;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        System.out.println();
        System.out.printf("TRIANGULO: %.3f%n", a * c / 2);
        System.out.printf("CIRCULO: %.3f%n", pi * Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f%n", (a + b) * c / 2);
        System.out.printf("QUADRADO: %.3f%n", b * b);
        System.out.printf("RETANGULO: %.3f%n", a * b);
    }
}
