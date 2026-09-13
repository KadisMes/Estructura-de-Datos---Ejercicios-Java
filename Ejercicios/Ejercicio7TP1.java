package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio7TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesRango = 0;
        
        int docMayorEdad = 0;
        int edadMayor = -1;
        char sexoMayor = ' ';
        
        System.out.println("CENSO PROVINCIAL (Ingrese 0 en DNI para finalizar)");
        
        while (true) {
            System.out.print("\nIngrese numero de documento: ");
            int documento = scanner.nextInt();
            
            if (documento == 0) {
                break;
            }
            
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();
            
            System.out.print("Ingrese sexo ('F' o 'M'): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            totalPersonas++;
            
            if (sexo == 'M') {
                totalVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesRango++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }
            
            if (edad > edadMayor) {
                edadMayor = edad;
                docMayorEdad = documento;
                sexoMayor = sexo;
            }
        }
        
        System.out.println("\n========================================");
        System.out.println("          RESULTADOS DEL CENSO          ");
        System.out.println("========================================");
        System.out.println("Cantidad total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);
        
        if (totalVarones > 0) {
            double porcentajeVarones = ((double) varonesRango / totalVarones) * 100;
            System.out.println("Porcentaje de varones entre 16 y 65 anos respecto al total de varones: " + porcentajeVarones + "%");
        } else {
            System.out.println("Porcentaje de varones entre 16 y 65: No se registraron varones.");
        }
        
        if (totalPersonas > 0) {
            System.out.println("\n--- PERSONA DE MAYOR EDAD ---");
            System.out.println("Documento: " + docMayorEdad);
            System.out.println("Edad: " + edadMayor);
            System.out.println("Sexo: " + sexoMayor);
        } else {
            System.out.println("No se registraron datos en el censo.");
        }
        
        scanner.close();
    }
}