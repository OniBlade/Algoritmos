/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author fagner
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ano_jose;   // declarei a variável jose
        double ano_xico;   // declarei a variável xico
        int cont = 0;      // receberá a quantidade de anos 

        double v;
        double c;

        ano_jose = 1.50;
        ano_xico = 1.30;

        while (ano_xico <= ano_jose) {
            ano_jose = ano_jose + 0.13;
            ano_xico = ano_xico + 0.13;
            cont++;
        }

        System.out.println("Quantidade  de anos até Xico ser mais velho que José: " + (cont + 1));

    }

}
