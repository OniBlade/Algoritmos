/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author fagner
 */
public class ParImpar {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        int numero = scanner.nextInt();        
        
        if (numero % 2 == 0){
            System.out.println("Número:"+numero+" é par");
        }else{
            System.out.println("Número:"+numero+" é impar");
        }
    }
}
