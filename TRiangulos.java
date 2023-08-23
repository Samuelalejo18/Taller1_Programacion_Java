import java.util.Scanner;

public class TRiangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese el lado del triangulo a: ");
        double a = input.nextDouble();
        System.out.print("Ingrese el lado del triangulo b: ");
        double b = input.nextDouble();
        System.out.print("Ingrese el lado del triangulo c: ");
        double c = input.nextDouble();
        if (a > (c + b) && b > (a + c) && c > (b + a)) {
            System.out.print("No es un triángulo válido");
        }
          if (a == b && b== c) {
            System.out.print("Triángulo es equilátero");

        } else if (a==b || b==c || a==c){
            System.out.print("Triángulo es isósceles");
        } else {
            System.out.print("Triángulo es escaleno");
        }
    }
}
