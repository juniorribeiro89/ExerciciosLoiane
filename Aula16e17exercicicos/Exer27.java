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
public class Exer27 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de temperaturas: ");
        int qtdTemperaturas = scan.nextInt();
        
        double temperatura;
        double soma = 0; 
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        for (int i=1; i<=qtdTemperaturas; i++){
            
            System.out.println("Entre com a Temperaturac " + i);
            temperatura = scan.nextDouble();
            
            soma += temperatura;
            
            if (temperatura > maior){
                maior = temperatura;
            }
            if (temperatura < menor){
                menor = temperatura;
            }
        }
        System.out.println("Média de temperatura: " + (soma/qtdTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
    
       
    
}
