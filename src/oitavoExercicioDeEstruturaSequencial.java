import java.util.Scanner;

public class oitavoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês.
         */

        double valor_hora;
        int horas_trabalhadas;
        double total_salario;

        System.out.println("Quanto ganha por hora?");
        valor_hora = scanner.nextDouble();

        System.out.println("Quantas horas trabalhou no mês?");
        horas_trabalhadas = scanner.nextInt();

        total_salario = valor_hora * horas_trabalhadas;

        System.out.println("O pagamento que deve ser recebido neste mês é de " + total_salario);
    }
}