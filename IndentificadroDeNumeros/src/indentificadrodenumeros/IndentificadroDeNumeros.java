/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indentificadrodenumeros;
import java.util.Scanner; //importação de scanner
/**
 * Data: 12/07/2023
 * @author Marcos
 * Exercício: Verificar se um número é positivo, negativo ou zero
 */
public class IndentificadroDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
