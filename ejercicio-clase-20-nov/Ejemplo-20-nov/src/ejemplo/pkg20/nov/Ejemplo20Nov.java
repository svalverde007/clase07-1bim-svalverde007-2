/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg20.nov;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo20Nov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String mensaje;
        int dias;
        double costoDia;
        double valorCancelar;
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese nombre de empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese dias trabajados:");
            dias = entrada.nextInt();

            System.out.println("Ingrese valor de costo por dia:");
            costoDia = entrada.nextDouble();

            valorCancelar = (dias * costoDia);
            
            entrada.nextLine();
            contador = contador + 1;

            mensaje = String.format("Nombre %s: dias %d, costo por dia $%.2f,"
                    + " total %.2f\n",
                    nombre,
                    dias,
                    costoDia,
                    valorCancelar);

            System.out.printf("%s\n", mensaje);
        }
    }

}
