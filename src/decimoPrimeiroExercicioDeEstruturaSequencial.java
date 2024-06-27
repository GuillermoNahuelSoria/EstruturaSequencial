import java.util.Scanner;

public class decimoPrimeiroExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        o produto do dobro do primeiro com metade do segundo .
        a soma do triplo do primeiro com o terceiro.
        o terceiro elevado ao cubo.
         */

        int n;
        int n1;
        double d;

        System.out.println("Qual é o primeiro numero inteiro?");
        n = scanner.nextInt();
        System.out.println("Qual é o segundo numero inteiro?");
        n1 = scanner.nextInt();
        System.out.println("Qual é o numero real?");
        d = scanner.nextDouble();

        double r1 = n * 2 * (n1/2);
        double r2 = n * 3 + (d);
        double r3 = Math.pow(d, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + r1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + r2);
        System.out.println("O terceiro elevado ao cubo é: " + r3);
    }
}