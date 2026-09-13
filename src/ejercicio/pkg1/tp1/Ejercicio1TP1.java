package ejercicio.pkg1.tp1;

import java.util.Scanner;

public class Ejercicio1TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();
        
        double[] notas = new double[n];
        double suma = 0;
        double notaAlta = -1;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            suma += notas[i];
            
            if (i == 0 || notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        
        double promedio = suma / n;
        
        System.out.println("\n RESULTADOS ");
        System.out.println("La nota mas alta es: " + notaAlta);
        System.out.println("El promedio de las notas es: " + promedio);
        
        scanner.close();
    }
}