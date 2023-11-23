package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Fecha");
        System.out.println("=====");

        System.out.println();

        // Datos de la fecha
        System.out.print("Proporcione el dia:");
        System.out.print("Proporcione el mes:");
        System.out.print("Proporcione el year:");

        try
        {
            // Crear Fecha
            Fecha f = new Fecha( year, mes, dia );
            
            // Mostrar los datos de la fecha
            System.out.println();
            System.out.print( "Fecha: ");
        }
        catch (FechaException fe )
        {
            // Mostrar mensaje de la excepcion
        }
        finally
        {
            entrada.close();
        }
    }
}