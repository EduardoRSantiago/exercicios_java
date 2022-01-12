/*
Exercício 03
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
*/
package estrutura_repetitivas;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, combustivel;

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        System.out.println("Qual combustível?");
        System.out.println("1.Alcool.");
        System.out.println("2.Gasolina.");
        System.out.println("3.Diesel.");
        System.out.println("4.Sair.");
        System.out.print("R: ");
        combustivel = sc.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            }

            System.out.println("Qual combustível");
            System.out.println("1.Alcool.");
            System.out.println("2.Gasolina.");
            System.out.println("3.Diesel.");
            System.out.println("4.Sair.");
            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


    }
}