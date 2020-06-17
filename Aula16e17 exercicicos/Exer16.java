/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula16e17;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer16 {
    public static void main(String[] args) {
        
        //Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um n-ésimo termo da série de fibonacci: ");
        //int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        while (proximo <= 500){
            
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        System.out.println(proximo);
        }
        
    }
    
}
