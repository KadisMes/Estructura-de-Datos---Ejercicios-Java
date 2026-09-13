package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio6TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCompetidores = 3;
        
        int vehiculoMejor = 0;
        double menorTiempo = -1;
        
        for (int i = 1; i <= totalCompetidores; i++) {
            System.out.println("\nCompetidor " + i + ":");
            System.out.print("Ingrese el numero de vehiculo: ");
            int numVehiculo = scanner.nextInt();
            
            System.out.print("Ingrese el tiempo en segundos (solo el numero): ");
            double tiempo = scanner.nextDouble();
            
            if (i == 1 || tiempo < menorTiempo) {
                menorTiempo = tiempo;
                vehiculoMejor = numVehiculo;
            }
        }
        
        System.out.println("\n- GANADOR (MENOR TIEMPO) -");
        System.out.println("Numero de vehiculo: " + vehiculoMejor);
        System.out.println("Tiempo realizado: " + menorTiempo + " segundos");
        
        scanner.close();
    }
}