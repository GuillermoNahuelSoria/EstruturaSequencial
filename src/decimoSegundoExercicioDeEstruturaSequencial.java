import java.util.Scanner;

public class decimoSegundoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
        peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
         */

        double h;

        System.out.println("Qual é a altura da pessoa?");
        h = scanner.nextDouble();

        double peso_ideal = (72.7*h) - 58;

        System.out.println("O peso ideal é: " + peso_ideal);
    }
}