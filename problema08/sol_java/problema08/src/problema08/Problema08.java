 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String cadena1 = "";
        String cadenaTitulos;
        String cadenaFinal;
        String salida;
        //medidas
        double medidaMetros;
        double yardas;
        double pulgadas;
        double pies;
        
        while(bandera){
            System.out.println("Ingrese la media en metros");
            medidaMetros = entrada.nextDouble();
            
            if(medidaMetros<0){
                System.out.println("La medida ingresada no es válida");
            }
            yardas = medidaMetros / 0.9144;
            pulgadas = medidaMetros *39.3701;
            pies = medidaMetros * 3.28084;
            
            cadenaTitulos = ("|  METROS  |  YARDAS  |  PULGADAS  |  PIES  |");
            cadena1 = String.format("%s\n |  %s  | %.2f  | %.2f |  %.2f  ",
                    cadena1,medidaMetros,yardas,pulgadas,pies);
            
            System.out.println(cadena1);
            
            entrada.nextLine();
            System.out.println("Si desea seguir ingresando datos escribir 'SI'");
            salida = entrada.nextLine();
            if (salida.equals("si")||salida.equals("SI")) {
                bandera = true;
            }else{
                bandera = false;
            }   
            cadenaFinal= String.format("%s%s",cadenaTitulos,cadena1);
            System.out.println(cadenaFinal);
        }
        
    }
    
}
