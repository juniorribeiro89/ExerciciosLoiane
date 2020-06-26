/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula19_Vetores_arrays;

/**
 *
 * @author Junior Ribeiro
 */
public class Arrays {
    public static void main(String[] args) {
     
//        double tempDia001 = 31.3;
//        double tempDia002 = 32;
//        double tempDia003 = 33.7;
//        double tempDia004 = 34;
//        double tempDia005 = 33.1;
          
    double[] temperaturas = new double[7];
    temperaturas[0] = 31.3;
    temperaturas[1] = 32;
    temperaturas[2] = 33.7;
    temperaturas[3] = 34;
    temperaturas[4] = 33.1;
    
        for (int i = 0; i<temperaturas.length; i++){ // Esse tipo de for permite ver o indice;
            System.out.println("O valor da temperatura do dia " +(i+1)+ " é: " + temperaturas[i]);
        }
        
        for (double temp : temperaturas){ // esse for melhorado ver apenas o valor;
            System.out.println("Temperaturas registradas: " + temp);
        }
        
        System.out.println("Tamanho do Array: " + temperaturas.length);
        System.out.println("O valor da posição 1 é: " + temperaturas[0]);

    }
    
}
