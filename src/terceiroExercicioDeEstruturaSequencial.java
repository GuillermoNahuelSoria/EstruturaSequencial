import java.util.Scanner;

public class terceiroExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça dois números e imprima a soma.
         */

        int num;
        int num1;

        System.out.println("Qual o primeiro numero?");
        num = scanner.nextInt();
        System.out.println("Qual o segundo numero?");
        num1 = scanner.nextInt();
        System.out.println("A soma dos dois numeros é: " + (num + num1));

    }
}