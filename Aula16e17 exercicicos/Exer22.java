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
public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informa a quantidade de CDS: ");
        int numCD = scan.nextInt();
        
        double soma = 0;
        double preco;
        
        for (int i=1; i<=numCD; i++){
            
            System.out.println("Entre com o preço dos CDS: " + i);
            preco = scan.nextDouble();
            
            soma += preco;            
        }
        
        double media =  soma / numCD;
        System.out.println("Numero de CDS: " + numCD);
        System.out.println("Preço medio pago " + media);
    }
    
}
