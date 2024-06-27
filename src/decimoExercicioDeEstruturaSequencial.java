import java.util.Scanner;

public class decimoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
         */

        double Celsius;
        double Fahrenheit;

        System.out.println("Qual é a temperatura em graus Celsius?");
        Celsius = scanner.nextDouble();
        Fahrenheit = Celsius * 1.8 + 32;

        System.out.println("A temperatura em graus Fahrenheit é a seguinte: " + Fahrenheit);
    }
}