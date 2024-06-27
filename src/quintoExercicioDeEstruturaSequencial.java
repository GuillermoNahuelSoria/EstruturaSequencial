import java.util.Scanner;

public class quintoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que converta metros para centímetros.
         */

        double metro;

        System.out.println("Insira a quantidade de metros");
        metro = scanner.nextDouble();
        double centimetros = metro * 100;
        System.out.println("A quantidade de metros convertidos em centímetros é: " + centimetros);

    }
}