import java.util.Scanner;

public class decimoTerceiroExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
        utilizando as seguintes fórmulas:
        Para homens: (72.7*h) - 58
        Para mulheres: (62.1*h) - 44.7
         */

        double h;
        double h1;

        System.out.println("Qual é a altura do homem?");
        h = scanner.nextDouble();
        System.out.println("Qual é a altura da mulher?");
        h1 = scanner.nextDouble();

        double PD_homem = (72.7*h) - 58;
        double PD_mulher = (62.1*h1) - 44.7;

        System.out.println("O peso ideal do homem é: " + PD_homem);
        System.out.println("O peso ideal da mulher é " + PD_mulher);
    }
}