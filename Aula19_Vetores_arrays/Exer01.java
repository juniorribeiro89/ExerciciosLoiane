/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula19_Vetores_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer01 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
        
    int[] timeA = new int[5];
    int[] timeB = new int[5];
        
        for (int i=0; i<timeA.length; i++){
            
            System.out.print("Entre com o numero do jogador " + i + " ");
            timeA[i] = scan.nextInt();       
            
        }
        System.out.print("Numeros dos jogadores = ");
        for (int i=0; i<timeA.length; i++){
            System.out.println(timeA[i] +  " ");
        }
    
    // Adicionando numero de jogador ao vetor time A
        
        
    }
}
