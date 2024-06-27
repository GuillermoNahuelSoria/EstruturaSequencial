import java.util.Scanner;

    public class segundoExercicioDeEstruturaSequencial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            /*
            Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
             */

            int num;

            System.out.println("Qual o numero?");
            num = scanner.nextInt();
            System.out.println("O numero informado foi: "+ num);

        }
    }