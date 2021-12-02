/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int suma = 0;
        double impar;
        int numero;
        boolean bandera = true;
        String salida;
        String cadena;

        while (bandera) {
            System.out.println("Ingrese un número");
            numero = entrada.nextInt();
            
             
            if(numero%2==0 && numero>=2){
                suma = suma + numero;
            }
            
            entrada.nextLine();
            System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }else{
                if(numero<2){
                    System.out.println("ERROR:Numero ingresado no valido");
                    bandera=false;
                }
            }

        }
        System.out.println(suma);
    }

}
