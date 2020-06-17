/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer11 {
    
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite Seu Salario: ");
        
        
        /*Primeira vez que fiz !
        double salario = scan.nextDouble();
        double salarioReajusteUm = salario + (salario * 20) / 100;
        double salarioReajusteDois = salario + (salario * 15) / 100;
        double salarioReajustetres = salario + (salario * 10) / 100;
        double salarioReajusteQuatro = salario + (salario * 5) /100;
        
        if(salario <= 280){
            System.out.println("Salario anterior: " + salario);
            System.out.println("Aumento de 20% ");
            System.out.println("Valor do aumento de: " + ((salario * 20) / 100));
            System.out.println("Novo Salario: " + salarioReajusteUm);
        }else if(salario == 280 || salario <=700){
            System.out.println("Salario anterior: " + salario);
            System.out.println("Aumento de 15% ");
            System.out.println("Valor do aumento de: " + ((salario * 15) / 100));
            System.out.println("Novo Salario: " + salarioReajusteDois);
        }else if(salario == 700 || salario <= 1500){
            System.out.println("Salario anterior: " + salario);
            System.out.println("Aumento de 10% ");
            System.out.println("Valor do aumento de: " + ((salario * 10) / 100));
            System.out.println("Novo Salario: " + salarioReajustetres);
        }else if(salario >= 1500){
            System.out.println("Salario anterior: " + salario);
            System.out.println("Aumento de 5% ");
            System.out.println("Valor do aumento de: " + ((salario * 5) / 100));
            System.out.println("Novo Salario: " + salarioReajusteQuatro);
        }*/
        
        // Metodo de Loiane;
        double salario = scan.nextDouble();
        int percentual = 0;
        
        if (salario < 280){
            percentual = 20;
        }else if(salario > 280 && salario < 700){
            percentual = 15;
        }else if(salario > 700 && salario < 1500){
            percentual = 10;
        }else if(salario > 1500){
            percentual = 5;
        }
        //saida minha !
        System.out.println("Salario antes do Reajuste: " + salario);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do Aumento: " + (salario * percentual) / 100);
        System.out.println("Novo Salario: " + (salario + (salario * percentual) / 100));
    }
}
