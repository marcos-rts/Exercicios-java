/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciobasico05;

import java.util.Scanner;

/**
 *
 * @author admin.zeus
 */
public class ExercicioBasico05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Verificador de Ano bissexto");
        System.out.print("Insira um ano: ");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println(ano + " é um ano bissexto");
        }else{
            System.out.println(ano + " não é um ano bissexto");
        }
        
    
    }
    
}
