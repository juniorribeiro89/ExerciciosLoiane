/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.AulasLoiane.ExerciciosLoiane.Aula16e17exercicicos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Junior Ribeiro
 */
public class Exer31 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Salario do Funcionario!");
        double salario = scan.nextDouble();
        
        double percentual = 1.5;
        salario += (salario/100) * percentual;
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for (int i=2007; i<=2020; i++){
            
            percentual *= 2;
            salario += (salario/100) * percentual;
            
            System.out.println(i  + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
}
