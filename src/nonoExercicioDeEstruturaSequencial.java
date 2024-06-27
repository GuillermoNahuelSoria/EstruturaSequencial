import java.util.Scanner;

public class nonoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em
        graus Celsius.
        C = 5 * ((F-32) / 9).
         */

        double Fahrenheit;
        double Celsius;

        System.out.println("Qual é a temperatura em graus Fahrenheit?");
        Fahrenheit = scanner.nextDouble();
        Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em graus Celsius é a seguinte: " + Celsius);
    }
}