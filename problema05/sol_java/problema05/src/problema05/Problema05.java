/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PersonaL-CTI
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //variables
        double corY;
        double corX;
        
        System.out.println("Ingrese la cordenada X");
        corX = entrada.nextDouble();
        
        System.out.println("Ingrese la coordenada Y");
        corY = entrada.nextDouble();
        
        if(corX == 0 && corY ==0){
            System.out.println("La coordenada esta en el centro del plano");
        } else if (corX > 0 && corY > 0){
            System.out.println("La coordenada se encuentra en el Primer cuadrante 1: Región superior derecha");
        } else if(corX < 0&& corY > 0){
            System.out.println("La coordenada se encuentra en el Segundo cuadrante 2: Región superior izquierda");
        } else if (corX < 0 && corY < 0){
            System.out.println("La coordenada se encuentra en el Tercer cuadrante 3: Región inferior izquierda");
        }else if (corX > 0 && corY <0){
            System.out.println("La coordenada se encuentra en el Cuarto cuadrante 4: Región inferior derecha");
        }
    }
    
}
