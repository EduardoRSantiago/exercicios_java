/*Exercício 02
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

package estrutura_repetitivas;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("coordenada X: ");
        x = sc.nextInt();
        System.out.print("coordenada Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            System.out.print("coordenada X: ");
            x = sc.nextInt();
            System.out.print("coordenada Y: ");
            y = sc.nextInt();
        }

    }
}
