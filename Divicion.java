import java.util.Scanner;

public class Divicion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numerador ");
        double numerador = input.nextDouble();
        System.out.print("Ingrese el denominador: ");
        double denominador = input.nextDouble();
        double divicion = numerador / denominador;
        double modulo = numerador % denominador;
        if (denominador == 0) {
            System.out.println("Math error, no es posible dividir entre 0");
        }
            else if (modulo == 0) {
                System.out.println(" es exacta.");
            } else {
                System.out.println(" no es exacta.");
                System.out.println(" El residuo es " + modulo);
            }
            System.out.println("El cociente es: " + divicion);
        }
    }

