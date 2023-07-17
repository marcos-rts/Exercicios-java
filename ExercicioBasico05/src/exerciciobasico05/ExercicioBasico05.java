package exerciciobasico05;
import java.util.Scanner;
/**
 * Data: 13/07/2023
 * @author Marcos
 * Exercicio: Verificar se um ano é bissexto 
 */
public class ExercicioBasico05 {
    public static void main(String[] args) {
        System.out.println("Verificador de Ano bissexto");
        System.out.print("Insira um ano: ");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        /**
         * Nesse exemplo, usamos a lógica do calendário gregoriano para verificar se um ano é bissexto:
         * Um ano é bissexto se for divisível por 4.
         * No entanto, anos que são divisíveis por 100 não são bissextos, 
         * a menos que também sejam divisíveis por 400.
         */
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println(ano + " é um ano bissexto");
        }else{
            System.out.println(ano + " não é um ano bissexto");
        }
    }
    
}
