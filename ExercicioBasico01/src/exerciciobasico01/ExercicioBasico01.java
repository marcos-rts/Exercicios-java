
package exerciciobasico01;
import java.util.Scanner;
/**
 * Data: 02/07/2023
 * @author Marcos
 * Exercicio: Verificar se um número é par ou ímpar
 */
public class ExercicioBasico01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //importa o teclado no terminal
        System.out.print("Digite um numero: ");  //exibe mensagem na tela
        int numero = teclado.nextInt(); // passa o que digitar em uma variavel
        String resultado = ((numero % 2) == 0)?"PAR":"IMPAR"; // faz a comparação de forma simples
        System.out.println(resultado); //exibe o resultado
    }
}
