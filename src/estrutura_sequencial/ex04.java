package estrutura_sequencial;/*Exercício 04
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        double valorHora;

        System.out.print("Numero do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Valor da hora: ");
        valorHora = sc.nextDouble();

        System.out.println("Numero do funcionário: " + numeroFuncionario);
        System.out.println("Salario: " + horasTrabalhadas * valorHora);
    }
}
