/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula19_Vetores_arrays;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer03 {
    public static void main(String[] args) {
        //Entrada
        Scanner scan = new Scanner(System.in);
        
        //Array
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        //Interações e entradas
        for (int i=0; i<vetorA.length; i++){
            System.out.print("Entre com os Números: " +i+ " ");
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        
        //Saidas
        System.out.print("Lista dos numeros digitados: ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        
        System.out.print("Lista dos numeros digitados: ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
