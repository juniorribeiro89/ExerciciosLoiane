/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula16e17exercicicos;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer28 {
    
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
        

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
    
        boolean primo = true;
        
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é Primo! - divisivel por " + i );
                primo = false;    
        }
        }
        if (primo){
            System.out.println("É Primo!");
        }
    
}
}