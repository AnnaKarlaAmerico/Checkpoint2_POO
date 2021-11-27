package Checkpoint2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o sexo do aluno (M ou F): ");
        String sexo = entrada.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = entrada.nextInt();
        System.out.println("Digite o peso do aluno: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura do aluno (em cm): ");
        double altura = entrada.nextDouble();
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica(sexo, idade, peso, altura);
        avaliacaoFisica.definirTreino();
    }
}
