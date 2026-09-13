package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio3TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de productos a ingresar: ");
        int n = scanner.nextInt();
        
        // Definimos los dos vectores con tamaño "n"
        int[] cantidades = new int[n];
        double[] costos = new double[n];
        
        // Carga de datos para ambos vectores
        for (int i = 0; i < n; i++) {
            System.out.println("\n- Producto " + (i + 1) + " -");
            System.out.print("Ingrese la cantidad adquirida: ");
            cantidades[i] = scanner.nextInt();
            
            System.out.print("Ingrese el costo unitario: ");
            costos[i] = scanner.nextDouble();
        }
        
        System.out.println("\n========================================");
        System.out.println("          RESULTADOS Y FILTRO           ");
        System.out.println("========================================");
        
        
        for (int i = 0; i < n; i++) {
            double precioTotalProducto = cantidades[i] * costos[i];
            System.out.println("Producto " + (i + 1) + " - Precio Total: $" + precioTotalProducto);
            
          
            if (precioTotalProducto > 1000) {
                System.out.println("  -> Este producto supera los $1000!");
            }
        }
        
        scanner.close();
    }
}