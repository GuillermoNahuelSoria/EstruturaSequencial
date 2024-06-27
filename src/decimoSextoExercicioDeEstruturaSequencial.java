import java.util.Scanner;

public class decimoSextoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
        da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
        e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades
        de latas de tinta a serem compradas e o preço total.
         */


        System.out.println("Qual o tamanho em metros quadrados da área a ser pintada? (em metros quadrados)");


        double areaPintada = scanner.nextDouble();

        // Cálculo da quantidade de latas de tinta
        double litrosPorMetroQuadrado = 1.0 / 3.0;
        double litrosNecessarios = areaPintada * litrosPorMetroQuadrado;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18); // Arredonda para cima. Isto é necessário porque não podemos comprar uma fração.

        // Cálculo do preço total
        double precoPorLata = 80.0;
        double precoTotal = latasNecessarias * precoPorLata;

        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total: R$ " + precoTotal);

    }
}