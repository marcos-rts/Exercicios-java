package exerciciobasico02;
import java.util.Scanner;
/**
 * Data: 04/07/2023
 * @author Marcos
 * Exercicio: Calcular a média de três números
 */
public class ExercicioBasico02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média é: " + media);
    }
}
