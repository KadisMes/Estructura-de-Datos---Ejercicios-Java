import java.util.Scanner;

public class Ejercicio2TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a cargar: ");
        int n = scanner.nextInt();
        
        double[] notas = new double[n];
        int aprobados = 0;
        int desaprobados = 0;
        
        // Bucle para cargar el vector y evaluar cada nota
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            // Evaluamos si está aprobado o desaprobado según la consigna (>= 6)
            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        // Mostramos los resultados finales con saltos de línea (\n) para ordenar
        System.out.println("\n RESULTADOS ");
        System.out.println("Cantidad de notas aprobadas: " + aprobados);
        System.out.println("Cantidad de notas desaprobadas: " + desaprobados);
        
        scanner.close();
    }
}