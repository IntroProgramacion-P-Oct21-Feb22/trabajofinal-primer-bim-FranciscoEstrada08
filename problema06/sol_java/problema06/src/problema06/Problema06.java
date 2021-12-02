/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numerador = 1;
        int denominador = 1;
        int limite = 100;
        String suma = "+";
        String cadena;
        String signo;
        
        while(denominador <= limite){
            cadena = String.format("%s%d/%d" + " ",
                suma,
                numerador,
                denominador);
            denominador = denominador +1; 
            System.out.printf("%s",cadena);
        }
        
        
    }
    
}
