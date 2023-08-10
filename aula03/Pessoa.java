/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula03;
import java.util.Scanner;
/**
 *
 * @author otniel
 */
public class Pessoa {
    int idade;
    
    public static int mediaIdades(Pessoa[] pessoas) {
        int soma = 0;
        for(Pessoa pessoa : pessoas) {
            soma += pessoa.idade;
        }
        return soma / pessoas.length;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qtdPessoas;
        int idade;
        Pessoa[] pessoas;
        
        System.out.print("Informe o número de pessoas: ");
        qtdPessoas = scan.nextInt();
        
        pessoas = new Pessoa[qtdPessoas];
        
        System.out.println("Informe as idades das " + qtdPessoas + " pessoas");
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idade = scan.nextInt();
            if (idade > 0 && idade < 121) {
                pessoas[i] = new Pessoa();
                pessoas[i].idade = idade;
            } else {
                System.out.println("Indade inválida, digite novamente");
                i--;
            }
        }
        
        scan.close();
        System.out.println("Media das idades: " + mediaIdades(pessoas));
    }
}
