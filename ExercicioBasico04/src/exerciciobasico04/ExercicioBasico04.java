/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciobasico04;

import java.util.Scanner;

/**
 * Data: 13/07/2023
 * @author Marcos
 * Exercicio: Calcular o fatorial de um número
 */
public class ExercicioBasico04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculando o fatorial de um numero");
        Scanner teclado = new Scanner(System.in);
        int resultado = 1;
        System.out.print("Numero para fatorar: ");
        int n = teclado.nextInt();
        
        for ( int i = 1; i <= n; i++){
            resultado *= i;
        }
        
        System.out.println("O resultado do fatorial de " + n + " é igual a: " + resultado);
        
    }
    
}
