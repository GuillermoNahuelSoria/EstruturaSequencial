import java.util.Scanner;

public class sextoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
         */

        double raio;

        System.out.println("Qual é o raio do circulo?");
        raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é: " + area);

    }

}