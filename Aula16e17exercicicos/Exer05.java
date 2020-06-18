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
public class Exer05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double populacaoA;
        double populacaoB;
        double indA;
        double indB;
        
        //População A
        boolean valido = false;
        do{
            System.out.println("Digite a Populaão A ");
            populacaoA = scan.nextDouble();
            
            if (populacaoA > 0){
                valido = true;
            }else{
                System.out.println("População Precisa ser maior que 0.");
            }
        }while(!valido);
        
        //taxa de crescimento 
        valido = false;
        do{
            System.out.println("Digite a taxa de Crescimento da população A ");
            indA = scan.nextDouble();
            
            if (indA > 0){
                valido = true;
            }else{
                System.out.println("População Precisa ser maior que 0.");
            }
        }while(!valido);

        //População B
        valido = false;
        do{
            System.out.println("Digite a Populaão B ");
            populacaoB = scan.nextDouble();
            
            if (populacaoB > 0){
                valido = true;
            }else{
                System.out.println("População Precisa ser maior que 0.");
            }
        
        }while(!valido);
        
        //indice de B
        valido = false;
        do{
            System.out.println("Digite a taxa de crescimento da população B ");
            indB = scan.nextDouble();
            
            if (indB > 0){
                valido = true;
            }else{
                System.out.println("População Precisa ser maior que 0.");
            }
        
        }while(!valido);
        
        
        int contador = 0;
        
        while (populacaoA < populacaoB){
            
            populacaoA += (populacaoA/100) * indA;
            populacaoB += (populacaoB/100) * indB;
            contador++;
        }
    
        System.out.println("População A:  " + populacaoA);
        System.out.println("População B:  " + populacaoB);
        System.out.println("Quantidade de anos:   " + contador);
  
}
}