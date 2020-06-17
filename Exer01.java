package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Segundo numero: ");
        double num2 = scan.nextDouble();
        
        if (num1 > num2){
        System.out.println("Numero 1 é maior que numero 2 ");
        
       }else
            System.out.println("Numero 2 é maior " + num2);
    }
    
}
