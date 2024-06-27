import java.util.Scanner;

public class decimoSetimoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da
        área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e
        que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que
        custam R$ 25,00.
        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        comprar apenas latas de 18 litros;
        comprar apenas galões de 3,6 litros;
        misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e
        sempre arredonde os valores para cima, isto é, considere latas cheias.
         */

        System.out.println("Qual o tamanho em metros quadrados da área a ser pintada?");
        double areaASERPintada = scanner.nextDouble();


        // Cálculo da quantidade de latas de tinta na primeira situação.
        double litrosPorMetroQuadrado = 1 / 6.0;
        double litrosNecessarios = areaASERPintada * litrosPorMetroQuadrado;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18); // Arredonda para cima. Isto é necessário porque não podemos comprar uma fração.

        // Cálculo do preço total da primeira situação.
        double precoPorLata = 80.0;
        double precoTotal = latasNecessarias * precoPorLata;


        // Cálculo da quantidade de galões de tinta na segunda situação.
        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / 3.6); // Arredonda para cima. Isto é necessário porque não podemos comprar uma fração.

        // Cálculo do preço total da segunda situação.
        double precoPorGalão = 25.0;
        double precoTotal1 = galoesNecessarios * precoPorGalão;


        // Cálculo da quantidade de latas cheias de tinta na terceira situação.
        double litrosPorMetroQuadrado1 = 1 / 6.0 * 1.1; // " 1.1 " Representa a adição de 10% de folga.
        double litrosNecessarios1 = areaASERPintada * litrosPorMetroQuadrado1;

        // Cálculo da quantidade de latas de 18 litros cheias de tinta.
        int latasCheias = (int) Math.ceil(litrosNecessarios1 / 18.0);

        // Cálculo do preço total de latas cheias de tinta.
        double precoPorLata1 = 80.0;
        double precoTotal2 = latasCheias * precoPorLata1;

        // Cálculo da quantidade de galões de 3,6 litros cheios de tinta.
        int galoesCheios = (int) Math.ceil(litrosNecessarios1 / 3.6);

        // Cálculo do preço total de galões cheios de tinta.
        double precoPorGalão1 = 25.0;
        double precoTotal3 = galoesCheios * precoPorGalão;


        // Apresentação dos resultados.
        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total: R$ " + precoTotal);

        System.out.println("Quantidade de galões de tinta necessários: " + galoesNecessarios);
        System.out.println("Preço total: R$ " + precoTotal1);

        System.out.println("Quantidade de latas cheias de tinta com dez por cento de folga: " +
                latasCheias);
        System.out.println("Preço total: R$ " + precoTotal2);

        System.out.println("Quantidade de galões cheios de tinta com dez por cento de folga: " +
                galoesCheios);
        System.out.println("Preço total: R$ " + precoTotal3);


        // Esta linha fecha o fluxo de entrada (input) que foi aberto anteriormente no programa. Isso é importante para liberar recursos e garantir que não haja vazamentos de memória.
        scanner.close();

    }
}