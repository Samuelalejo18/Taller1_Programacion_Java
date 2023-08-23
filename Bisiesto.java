public class Bisiesto {
    public static void main(String[] args) {
        for (int i = 1582; i <= 2024; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " es bisiesto.");
            } else {
                System.out.println(i + " no es bisiesto.");
            }
        }
    }
}