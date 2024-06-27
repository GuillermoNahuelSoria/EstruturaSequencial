import java.util.Scanner;

public class decimoOitavoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um
        link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando
        este link (em minutos).
         */

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoEmMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeEmMbps = scanner.nextDouble();


        // Convertendo a velocidade para MB/s.
        double velocidadeEmMBps = velocidadeEmMbps / 8;


        // Calculando o tempo aproximado de download em segundos
        double tempoEmSegundos = tamanhoArquivoEmMB / velocidadeEmMBps;


        // Convertendo para minutos
        double tempoEmMinutos = tempoEmSegundos / 60;

        System.out.println("Tempo aproximado de download: " + tempoEmMinutos + " minutos");

        scanner.close();

    }
}