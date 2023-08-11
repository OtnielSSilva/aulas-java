package aula03;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    double salario;
    int filhos;

    public static double mediaSalario(Funcionarios[] funcionarios) {
        double soma = 0;
        for (Funcionarios funcionario : funcionarios) {
            soma += funcionario.salario;
        }
        return soma / funcionarios.length;
    }

    public static int mediaFilhos(Funcionarios[] funcionarios) {
        int soma = 0;
        for (Funcionarios funcionario : funcionarios) {
            soma += funcionario.filhos;
        }
        return soma / funcionarios.length;
    }

    public static double porcentagemSalariosAteTresMil(Funcionarios[] funcionarios) {
        int qtd = 0;
        for (Funcionarios funcionario : funcionarios) {
            if (funcionario.salario <= 3000 && funcionario.filhos > 0) {
                qtd++;
            }
        }
        return (qtd / (double) funcionarios.length) * 100;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        int filhos;
        double salario;
        Funcionarios[] funcionarios = new Funcionarios[2];

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionarios(); // initialize each element of the array
            System.out.print("Informe o salario: ");
            salario = scan.nextDouble();
            while (salario <= 0) {
                System.out.println("Valor inválido, digite novamente");
                salario = scan.nextDouble();
            }
            funcionarios[i].salario = salario;

            System.out.print("Informe o número de filhos: ");
            filhos = scan.nextInt();
            while (filhos < 0) {
                System.out.println("Valor inválido, digite novamente");
                filhos = scan.nextInt();
            }
            funcionarios[i].filhos = filhos;
        }
        scan.close();

        System.out.printf("Media dos salarios: %.2f\n", mediaSalario(funcionarios));
        System.out.printf("Media dos filhos: %d\n", mediaFilhos(funcionarios));
        System.out.printf("Porcentagem de pessoas com salarios ate 3000, que possuem filhos: %.2f%%\n",
                porcentagemSalariosAteTresMil(funcionarios));
    }
}