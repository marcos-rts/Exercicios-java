package exerciciobasico04;
import java.util.Scanner;

/**
 * Data: 13/07/2023
 * @author Marcos
 * Exercicio: Calcular o fatorial de um número
 */
public class ExercicioBasico04 {
    public static void main(String[] args) {
        System.out.println("Calculando o fatorial de um numero");
        Scanner teclado = new Scanner(System.in);
        int resultado = 1;
        System.out.print("Numero para fatorar: ");
        int n = teclado.nextInt();    
        //Inicio da formula para fatoração
        for ( int i = 1; i <= n; i++){
            resultado *= i;
        }
        //fim da formula de faotração
        System.out.println("O resultado do fatorial de " + n + " é igual a: " + resultado);        
    }
}
