package exerciciobasico03;
import java.util.Scanner; //importação de scanner
/**
 * Data: 12/07/2023
 * @author Marcos
 * Exercício: Verificar se um número é positivo, negativo ou zero
 */
public class ExercicioBasico03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //importa o teclado
        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt(); 
        if (numero > 0){
            System.out.println("O numero é positivo");
        }else if (numero < 0){
            System.out.println("O numero é negativo");
        }else{
            System.out.println("O numero é 0");
        }
    }
}
