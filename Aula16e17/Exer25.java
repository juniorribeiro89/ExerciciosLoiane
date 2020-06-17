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
public class Exer25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //System.out.println("Lojas tabajaras");
        
        boolean sair = false;
        String continuarComp;
        int quantidade;
        double preco;
        double total;
        String output;
        double valorPago, troco;
        
        do{
            System.out.println("Deseja Informar uma nova compra? S/N");
            continuarComp = scan.next();
            
            if (continuarComp.equalsIgnoreCase("s")){
                
                output = "Lojas tabajaras\n";
                
                System.out.println("Quantidade de produtos: ");
                quantidade = scan.nextInt();
                
                total = 0;
                
                for (int i=1; i<=quantidade; i++){
                    System.out.println("Informe o Preço do Produto " + i);
                    preco = scan.nextDouble();
                    
                    total += preco;
                    output += "produto " + i + " : R$ " + preco + "\n";
                }
                
                output += " Total: R$ " + total;
                System.out.println(" Total: R$ " + total);
                
                System.out.println("Entre com o Valor Pago: ");
                valorPago = scan.nextDouble();
                
                output += " Dinheiro: " + valorPago + "\n";
                troco = valorPago - total;
                
                output += " Troco: R$ " + troco;
                
                System.out.println(output);
                        
            }else{
                sair = true;
            }
        
        }while(!sair);
        
    }
    
}
