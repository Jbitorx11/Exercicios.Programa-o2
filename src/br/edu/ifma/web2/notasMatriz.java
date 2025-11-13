package br.edu.ifma.web2;
import java.util.Scanner;

public class notasMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[4];
        double[][] notas = new double[4][3];
        double[] media = new double[4];
        String[] situacao = new String[4];
        int aprovados = 0, reprovados = 0;
        double mediasTurma = 0;

            for (int i = 0; i < nome.length; i++) {
                System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
                nome[i] = teclado.nextLine();

                double soma = 0;
                for (int j = 0; j < notas[i].length; j++) {
                    System.out.print("Digite a " + (j + 1) + " nota do Alnuno " + nome[i] + ": ");
                    notas[i][j] = teclado.nextDouble();
                    soma += notas[i][j];
                }
                teclado.nextLine();
                media[i] = soma / notas[i].length;
                mediasTurma += media[i];

                if (media[i] >= 7.0) {
                    situacao[i] = "Aprovado";
                    aprovados++;
                } else {
                    situacao[i] = "Reprovado";
                    reprovados++;
                }
            }

        System.out.println("\n+--------------+---------+---------+---------+---------+---------+---");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-12s\n",
                "Aluno", "Nota 1", "Nota 2", "Nota 3", "Média", "Situação");
        System.out.println("+--------------+---------+---------+---------+---------+---------+---");
        for (int i = 0; i < nome.length; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10.2f %-12s\n",
                    nome[i], notas[i][0], notas[i][1], notas[i][2], media[i], situacao[i]);
        }
        System.out.println("+--------------+---------+---------+---------+---------+---------+---");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-12s\n",
                "Media da Turma", "-", "-", "-", "-", mediasTurma);
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-12s\n",
                "Aprovados", "-", "-", "-", "-", aprovados);
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-12s\n",
                "Reprovados", "-", "-", "-", "-", reprovados);
        System.out.println("+--------------+---------+---------+---------+---------+---------+---");
        teclado.close();
    }
}
