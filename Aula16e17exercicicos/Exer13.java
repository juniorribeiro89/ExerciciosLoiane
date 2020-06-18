package com.loiane.cursojava.aula16e17;


import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer13 {
    public static void main(String[] args) {
        System.out.println("Vamos Calcular");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int base = scan.nextInt();
        
        System.out.println("Digite seu expoente");
        int exp = scan.nextInt();
       
        int resultado = base;
        for (int i=1; i<exp; i++){
            resultado *= base;        
        }
        System.out.println("Resultado " + resultado);
    }
}
