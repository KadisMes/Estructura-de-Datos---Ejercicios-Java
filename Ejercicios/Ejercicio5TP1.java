package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio5TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalClientes = 5;
        
        for (int i = 1; i <= totalClientes; i++) {
            System.out.println("\n--- Cliente " + i + " de " + totalClientes + " ---");
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = scanner.next();
            
            int tipoServicio = 0;
            double montoPagar = 0;
            boolean servicioValido = false;
            
            while (!servicioValido) {
                System.out.print("Ingrese el tipo de servicio (1: 30 megas, 2: 50 megas, 3: 100 megas): ");
                tipoServicio = scanner.nextInt();
                
                switch (tipoServicio) {
                    case 1:
                        montoPagar = 750;
                        servicioValido = true;
                        break;
                    case 2:
                        montoPagar = 1100;
                        servicioValido = true;
                        break;
                    case 3:
                        montoPagar = 1500 - (1500 * 0.05);
                        servicioValido = true;
                        break;
                    default:
                        System.out.println("Opcion incorrecta. Por favor, intente de nuevo para este cliente.");
                }
            }
            
            System.out.println("\n----------------------------------------");
            System.out.println("         FACTURACION DEL CLIENTE        ");
            System.out.println("----------------------------------------");
            System.out.println("DNI del cliente: " + dni);
            System.out.println("Numero de servicio: " + tipoServicio);
            System.out.println("Monto a pagar: $" + montoPagar);
            System.out.println("----------------------------------------");
        }
        
        scanner.close();
    }
}