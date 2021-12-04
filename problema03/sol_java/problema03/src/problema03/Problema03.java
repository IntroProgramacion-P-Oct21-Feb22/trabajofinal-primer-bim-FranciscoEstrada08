/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        String nombre;
        double tipoEmpleado;
        double horasTrabajadas;
        double cuotaHora;
        double subtotal;
        double horasExtra;
        double valorHorasExtra;
        double totalPagar;

        double cuota1 = 1.5;
        double cuota2 = 2;
        double cuota3 = 2.5;
        double cuota4 = 3;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado al que corresponde");
        tipoEmpleado = entrada.nextInt();

        entrada.nextLine(); //Limpieza buffer

        System.out.println("Ingrese la cantidad de horas trabajadas");
        horasTrabajadas = entrada.nextDouble();

        entrada.nextLine(); //Limpieza buffer

        System.out.println("Ingrese la cuota que se le paga por hora");
        cuotaHora = entrada.nextDouble();
        if (tipoEmpleado <= 0 || tipoEmpleado > 4 || horasTrabajadas <= 0) {
            System.out.println("Por favor ingrese datos válidos");
        } else {
            if (horasTrabajadas <= 40) {
                subtotal = horasTrabajadas * cuotaHora;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %.0f\n"
                        + "Numero de horas trabajadas: %.2f\n"
                        + "Cuota que se le paga por hora: %.2f\n"
                        + "Sueldo por pagar: %.2f\n", nombre, tipoEmpleado, horasTrabajadas,
                        cuotaHora, subtotal);
            } else {
                if ((tipoEmpleado == 1 || tipoEmpleado == 2 || tipoEmpleado == 3 || tipoEmpleado == 4)
                        && horasTrabajadas < 40) {
                    subtotal = horasTrabajadas * cuota1;
                    System.out.printf("Nombre del empleado: %s\n"
                            + "Tipo de empleado: %.0f\n"
                            + "Numero de horas trabajadas: %.2f\n"
                            + "Cuota que se le paga por hora: %.2f\n"
                            + "Sueldo por pagar: %.2f\n", nombre, tipoEmpleado, horasTrabajadas,
                            cuotaHora, subtotal);
                } else {
                    if (tipoEmpleado == 1 && horasTrabajadas > 40) {
                        subtotal = 40 * cuotaHora;
                        horasExtra = horasTrabajadas - 40;
                        valorHorasExtra = (cuotaHora * cuota1) * horasExtra;
                        totalPagar = valorHorasExtra + subtotal;

                        System.out.printf("Nombre del empleado: %s\n"
                                + "Tipo de empleado: %.0f\n"
                                + "Numero de horas trabajadas: %.2f\n"
                                + "Cuota que se le paga por hora: %.2f\n"
                                + "Sueldo por pagar: %.2f\n", nombre, tipoEmpleado,
                                horasTrabajadas,
                                cuotaHora, totalPagar);
                    } else {
                        if (tipoEmpleado == 2 && horasTrabajadas > 40) {
                            subtotal = 40 * cuotaHora;
                            horasExtra = horasTrabajadas - 40;
                            valorHorasExtra = (cuotaHora * cuota2) * horasExtra;
                            totalPagar = valorHorasExtra + subtotal;

                            System.out.printf("Nombre del empleado: %s\n"
                                    + "Tipo de empleado: %.0f\n"
                                    + "Numero de horas trabajadas: %.2f\n"
                                    + "Cuota que se le paga por hora: %.2f\n"
                                    + "Sueldo por pagar: %.2f\n", nombre, tipoEmpleado,
                                    horasTrabajadas,
                                    cuotaHora, totalPagar);
                        } else {
                            if (tipoEmpleado == 3 && horasTrabajadas > 40) {
                                subtotal = 40 * cuotaHora;
                                horasExtra = horasTrabajadas - 40;
                                valorHorasExtra = (cuotaHora * cuota3) * horasExtra;
                                totalPagar = valorHorasExtra + subtotal;

                                System.out.printf("Nombre del empleado: %s\n"
                                        + "Tipo de empleado: %.0f\n"
                                        + "Numero de horas trabajadas: %.2f\n"
                                        + "Cuota que se le paga por hora: %.2f\n"
                                        + "Sueldo por pagar: %.2f\n", nombre,
                                        tipoEmpleado, horasTrabajadas,
                                        cuotaHora, totalPagar);
                            } else {
                                if (tipoEmpleado == 4 && horasTrabajadas > 40) {
                                    subtotal = 40 * cuotaHora;
                                    horasExtra = horasTrabajadas - 40;
                                    valorHorasExtra = (cuotaHora * cuota4) * horasExtra;
                                    totalPagar = valorHorasExtra + subtotal;

                                    System.out.printf("Nombre del empleado: %s\n"
                                            + "Tipo de empleado: %.0f\n"
                                            + "Numero de horas trabajadas: %.2f\n"
                                            + "Cuota que se le paga por hora: %.2f\n"
                                            + "Sueldo por pagar: %.2f\n", nombre,
                                            tipoEmpleado, horasTrabajadas,
                                            cuotaHora, totalPagar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
