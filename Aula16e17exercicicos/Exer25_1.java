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
public class Exer25_1 {
    public static void main(String[] args) {
        
        //Mini Caixa
        Scanner scan = new Scanner(System.in);
     
        //System.out.println("Lojas Tabajaras");
        
        boolean sair = false;
        String continuarCompra;
        int quantidadeProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;
        
        
        do{
            
            System.out.println("Deseja continuar uma nova compra? (S/N) ");
            continuarCompra = scan.next();
            
            if (continuarCompra.equalsIgnoreCase("s")){
                
                output = "Lojas Tabajaras\n";
              
                System.out.println("Digite a quantidade de produtos da compra: ");
                quantidadeProdutos = scan.nextInt();
                
                total = 0;
                
                for (int i=1; i<=quantidadeProdutos; i++){
                    System.out.println("Informe preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n"; 
                }
                
                //output += "Total: R$ " + total;
                System.out.println("Total: R$ " + total);
                output += "Total: R$ " + total + "\n";
                
                System.out.println("Entre com o valor pago: ");
                
                valorPago = scan.nextDouble();
                output += "Dinheiro: R$ " + valorPago + "\n";
                
                troco = valorPago - total;
                output += "troco: R$ " + troco;
                
                System.out.println(output);
                
            }else{
                sair = true;
            }
        }while(!sair);
        
    }
    
}
