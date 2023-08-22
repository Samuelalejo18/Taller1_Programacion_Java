import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese peso, altura y edad
        System.out.print("Ingrese su estatura(en m): ");
        double Estatura = input.nextDouble();
        System.out.print("Ingrese su peso(en kg): ");
        double Peso = input.nextDouble();
        System.out.print("Ingrese su edad:");
        double Edad = input.nextDouble();

        double IMC = Peso / (Estatura * Estatura);

        if (IMC < 22 && Edad < 45) {
            System.out.print("su IMC es de " + IMC + " y por su edad de "+Edad+" años, su condición de riesgo es baja");
        } else if (IMC < 22 && Edad >= 45) {
            System.out.print("su IMC es de " + IMC + " y por su edad de "+Edad+" años , su condición de riesgo es Medio");
        } else if (IMC >= 22 && Edad < 45) {
            System.out.print("su IMC es de " + IMC + " y por su edad de "+Edad+"  años, su condición de riesgo es Medio");
        } else if (IMC >= 22 && Edad >= 45) {
            System.out.print("su IMC es de " + IMC + " y por su edad de "+Edad+"  años, su condición de riesgo es alto");
        }
        }

    }
