import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: R$ ");
        float salario = scanner.nextFloat();

        float perAumento = 0;
        float valAumento = 0;

        if (salario <= 280.00f) {
            perAumento = 20;
        } else if (salario <= 700.00f) {
            perAumento = 15;
        } else if (salario <= 1500.00f) {
            perAumento = 10;
        } else {
            perAumento = 5;
        }

        valAumento = salario * (perAumento / 100);
        float novoSalario = salario + valAumento;
        float aumentoReal = valAumento - (valAumento * 0.038f);

        System.out.println("\nResultados:");
        System.out.printf("1. Salário antes do reajuste salarial: R$ %.2f\n", salario);
        System.out.printf("2. Percentual de aumento aplicado: %.2f%%\n", perAumento);
        System.out.printf("3. Valor do aumento: R$ %.2f\n", valAumento);
        System.out.printf("4. Novo salário, após o aumento: R$ %.2f\n", novoSalario);
        System.out.printf("5. Valor do aumento real, descontada a inflação: R$ %.2f\n", aumentoReal);
    }
}