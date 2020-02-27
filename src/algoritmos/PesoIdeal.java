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
public class PesoIdeal {

    public static void main(String[] args) {
        String sexo;
        double peso = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o sexo:");
        sexo = scanner.next();

        System.out.println("Informe o peso:");
        peso = scanner.nextDouble();

        if (sexo.equals("M")) {
            System.out.println("Sexo Masculino e peso = " + peso);

        } else {
            System.out.println("Sexo Feminino e peso = " + peso);
            if (peso < 19.1) {
                System.out.println("Abaixo do peso");
            } else {
                if (peso >= 19.1 && peso <= 25.8) {
                    System.out.println("Peso normal");
                } else {
                    if (peso > 25.8 && peso <= 27.3) {
                        System.out.println("Marginalmente acima do peso");
                    } else {
                        if (peso > 27.3 && peso <= 32.3) {
                            System.out.println("Acima do peso ideal");
                        } else {
                            System.out.println("Obeso");
                        }
                    }
                }

            }

        }

        System.out.println("Sexo informado: " + sexo);
    }
}
