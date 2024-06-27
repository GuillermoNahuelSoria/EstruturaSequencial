import java.util.Scanner;

public class quartoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça as 4 notas bimestrais e mostre a média.
         */

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int soma;
        double media;

        System.out.println("Qual é a primeira nota bimestral?");
        nota1 = scanner.nextInt();
        System.out.println("Qual é a segunda nota bimestral?");
        nota2 = scanner.nextInt();
        System.out.println("Qual é a terceira nota bimestral?");
        nota3 = scanner.nextInt();
        System.out.println("Qual é a quarta nota bimestral?");
        nota4 = scanner.nextInt();
        soma = (nota1 + nota2 + nota3 + nota4);
        System.out.println("A soma de todas as notas bimestrais é: " + soma);
        media = soma / 4;
        System.out.println("A media da soma é: " + media);

    }
}