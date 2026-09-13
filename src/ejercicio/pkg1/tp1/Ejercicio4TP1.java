package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio4TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCamiones = 30; 
        
        String[] patentes = new String[totalCamiones];
        String[] choferes = new String[totalCamiones];
        String[] tiposCarga = new String[totalCamiones];
        String[] horas = new String[totalCamiones];
        
        int contadorTe = 0;
        
        for (int i = 0; i < totalCamiones; i++) {
            System.out.println("\n- Datos del camion " + (i + 1) + " de " + totalCamiones + " -");
            System.out.print("Patente: ");
            patentes[i] = scanner.next();
            
            scanner.nextLine();
            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = scanner.nextLine();
            
            System.out.print("Tipo de carga (madera, yerba o te): ");
            tiposCarga[i] = scanner.next();
            
            System.out.print("Hora de egreso (ej: 12:34): ");
            horas[i] = scanner.next();
            
            
            if (tiposCarga[i].equalsIgnoreCase("te")) {
                contadorTe++;
            }
        }
        
        System.out.println("\n========================================");
        System.out.println("   LISTADO GENERAL DE EGRESO DE CAMIONES   ");
        System.out.println("========================================");
        
        for (int i = 0; i < totalCamiones; i++) {
            System.out.println("Camion " + (i + 1) + ":");
            System.out.println("  Patente: " + patentes[i]);
            System.out.println("  Chofer: " + choferes[i]);
            System.out.println("  Tipo de carga: " + tiposCarga[i]);
            System.out.println("  Hora de egreso: " + horas[i]);
        }
        
        System.out.println("\nCantidad total de camiones que cargaron té: " + contadorTe);
        
        scanner.close();
    }
}