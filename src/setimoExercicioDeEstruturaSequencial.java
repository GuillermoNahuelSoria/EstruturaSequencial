import java.util.Scanner;

public class setimoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
         */

        double ladodoquadrado;

        System.out.println("Qual é a medida de um lado do quadrado?");
        ladodoquadrado = scanner.nextDouble();

        double areadoQ = Math.PI * Math.pow(ladodoquadrado, 2);
        double dobrodaareadoQ = areadoQ * areadoQ;

        System.out.println("O dobro da área do quadrado é:: " + dobrodaareadoQ);

    }
}