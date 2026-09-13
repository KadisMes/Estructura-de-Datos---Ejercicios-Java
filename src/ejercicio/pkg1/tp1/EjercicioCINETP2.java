package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class EjercicioCINETP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int filas = 10;
        int columnas = 10;
        
        String[][] sala = new String[filas][columnas];
        String[][] telefonos = new String[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = "L"; 
                telefonos[i][j] = "";
            }
        }
        
        int opcion = 0;
        
        do {
            System.out.println("\n--- SISTEMA DE RESERVAS DE CINE ---");
            System.out.println("1. Ver plano de la sala");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- PLANO DE LA SALA (L = Libre, X = Reservado) ---");
                    System.out.print("  ");
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    
                    for (int i = 0; i < filas; i++) {
                        System.out.print(i + " ");
                        for (int j = 0; j < columnas; j++) {
                            if (sala[i][j].equals("L")) {
                                System.out.print("L ");
                            } else {
                                System.out.print("X ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                    
                case 2:
                    System.out.print("\nIngrese la fila (0 al 9): ");
                    int fReserva = scanner.nextInt();
                    System.out.print("Ingrese el asiento/columna (0 al 9): ");
                    int cReserva = scanner.nextInt();
                    
                    if (fReserva >= 0 && fReserva < filas && cReserva >= 0 && cReserva < columnas) {
                        if (sala[fReserva][cReserva].equals("L")) {
                            scanner.nextLine(); 
                            System.out.print("Ingrese el nombre del cliente: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese el telefono del cliente: ");
                            String telefono = scanner.next();
                            
                            sala[fReserva][cReserva] = nombre;
                            telefonos[fReserva][cReserva] = telefono;
                            System.out.println("¡Asiento reservado con exito!");
                        } else {
                            System.out.println("\nEl asiento ya esta ocupado.");
                            System.out.println("Reservado por: " + sala[fReserva][cReserva]);
                            System.out.println("Telefono de contacto: " + telefonos[fReserva][cReserva]);
                        }
                    } else {
                        System.out.println("Fila o asiento invalido. Intente entre 0 y 9.");
                    }
                    break;
                    
                case 3:
                    System.out.print("\nIngrese la fila del asiento a liberar (0 al 9): ");
                    int fEliminar = scanner.nextInt();
                    System.out.print("Ingrese la columna del asiento a liberar (0 al 9): ");
                    int cEliminar = scanner.nextInt();
                    
                    if (fEliminar >= 0 && fEliminar < filas && cEliminar >= 0 && cEliminar < columnas) {
                        if (!sala[fEliminar][cEliminar].equals("L")) {
                            sala[fEliminar][cEliminar] = "L";
                            telefonos[fEliminar][cEliminar] = "";
                            System.out.println("¡La reserva ha sido eliminada y el asiento esta libre!");
                        } else {
                            System.out.println("El asiento ya se encontraba libre.");
                        }
                    } else {
                        System.out.println("Fila o asiento invalido.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opcion invalida.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
}