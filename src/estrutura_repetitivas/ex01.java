/*Exercício 01
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

package estrutura_repetitivas;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        int senha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
    }
}
