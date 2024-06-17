import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        // Læs radius fra brugeren
        System.out.print("Indtast radius: ");
        double radius = input.nextDouble();

        // Beregn areal og omkreds
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // Udskriv resultaterne
        System.out.println("Arealet af cirklen er: " + area);
        System.out.println("Omkredsen af cirklen er: " + circumference);

        input.close();
    }
}
