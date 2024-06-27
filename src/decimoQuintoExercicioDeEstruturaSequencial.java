import java.util.Scanner;

public class decimoQuintoExercicioDeEstruturaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
        Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        salário bruto.
        quanto pagou ao INSS.
        quanto pagou ao sindicato.
        o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido.
         */

                // Declaracao de variaveis
                double pagamento_por_hora, total_horas_trabalhadas, salario_bruto, imposto_renda, inss, sindicato,
                        descontos, salario_liquido;


                //inicio do codigo
                System.out.println("Primeiro, insira o valor da remuneração por hora e, em seguida, insira o número de horas trabalhadas no mês: ");

                pagamento_por_hora = scanner.nextDouble();
                total_horas_trabalhadas = scanner.nextDouble();


                // Validação de entrada
                if (pagamento_por_hora < 0 || total_horas_trabalhadas < 0) {
                    System.out.println("Valores inválidos. Certifique-se de inserir valores positivos.");
                    return;
                }


                // Atribuicao de valores
                salario_bruto = pagamento_por_hora * total_horas_trabalhadas;
                imposto_renda = 0.11 * salario_bruto;
                inss = 0.08 * salario_bruto;
                sindicato = 0.05 * salario_bruto;
                descontos = imposto_renda + inss + sindicato;
                salario_liquido = salario_bruto - descontos;

                System.out.printf("\t\timposto_renda (11%%) : R$ %.2f%n", salario_bruto);
                System.out.printf("\t\tIR (11%%) : R$ %.2f%n", imposto_renda);
                System.out.printf("\t\tINSS (8%%) : R$ %.2f%n", inss);
                System.out.printf("\t\tSindicato (5%%) : R$ %.2f%n", sindicato);
                System.out.printf("\t\tSalário Liquido : R$ %.2f%n", salario_liquido);

            }
        }