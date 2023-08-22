

import java.util.Arrays;
        import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ordenar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese cuatro números
        System.out.print("Ingrese el  número 1: ");
        double numero1 = input.nextDouble();
        System.out.print("Ingrese el úmero 2: ");
        double numero2 = input.nextDouble();
        System.out.print("Ingrese el número 3: ");
        double numero3 = input.nextDouble();
        System.out.print("Ingrese el cuarto número 4: ");
        double numero4 = input.nextDouble();

        // Colocar los números en un arreglo
        double[] numeros = {numero1, numero2, numero3, numero4};

        // Ordenar el arreglo de menor a mayor
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("Los números ordenados de menor a mayor son:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }
}
