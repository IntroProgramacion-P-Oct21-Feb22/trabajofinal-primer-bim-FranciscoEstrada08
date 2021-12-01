/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //variables
        
        double numero1;
        double numero2;
        double numero3;
        
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer numero");
        numero3 = entrada.nextDouble();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es:" + numero1);
        }else{
            if(numero2> numero1 && numero2 > numero3){
                System.out.println("EL numero mayor es:" + numero2);
            }else{
                if(numero3> numero1 && numero3 > numero2){
                    System.out.println("EL numero mayor es:" + numero3);
                }else{
                    if(numero1== numero2 || numero1 == numero3 || numero2 == numero3){
                        System.out.println("ERROR: uno o varios de los números ingresados son iguales");
                    }
                }
            }
        }
    }
    
}
