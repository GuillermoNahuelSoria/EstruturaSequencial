import java.util.Scanner;

public class decimoQuartoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário
        de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
        de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
        João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
        Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa
        que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
         */


        // Leitura do peso de peixes
        System.out.print("Digite o peso de peixes (em quilos): ");
        double peso = scanner.nextDouble();

        // Verificação do excesso
        double limite = 50.0;
        double excesso = peso - limite;

        // Cálculo da multa
        double valorMulta = excesso * 4.0;

        // Exibição dos resultados
        if (excesso > 0) {
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + valorMulta);
        } else {
            System.out.println("Peso dentro do limite. Sem multa.");
        }

        scanner.close();

    }
}

/*

V2:

 // Declaracao de variaveis
        double peso, excesso, peso_regulado, multa;

        // Atribuicao de valor a variavel
        peso_regulado = 50.00d;

        // Inicio do codigo
        System.out.print("\n");
        System.out.println("¡Bem-vindo usuário!" + "\n");
        System.out.println("Introduza a quantidade de peixe (em quilos):");
        peso = scanner.nextDouble();
        System.out.print("\n");
        System.out.print("A quantidade informada foi: " + peso + "\n\n");

        // Atribuicao de valor a variavel
        excesso =  peso - peso_regulado;
        multa = excesso * 4.00;


        // Estrutura de condicao

        if (peso > peso_regulado) {
            System.out.println("Tem excesso de peixe. A quantidade de excesso é: " + excesso + "\n");
            System.out.println("Portanto, de acordo com a multa estabelecida pelo regulamento de pesca do
            estado de São Paulo, que é de R$ 4,00 por quilo excedente, você deve pagar um total de: R$" + multa + "\n");
        } else if (peso < peso_regulado){
            System.out.println("A quantidade de peixes é inferior ao peso regulado pela regulamentação de
            pesca do estado de São Paulo. Portanto, você não tem que pagar nenhuma multa\n");
        }

        System.out.print("¡Muito Obrigado pela sua participação!\n");


           }
    }


 */