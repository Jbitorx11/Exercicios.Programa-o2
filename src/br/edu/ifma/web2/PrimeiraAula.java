package br.edu.ifma.web2;
import java.util.Scanner;
public class PrimeiraAula {
    public static void main(String[] args) {
        System.out.println("Olá Mundo !!");
        double soma;
        double media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextInt();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextInt();

        soma = nota3 + nota2 + nota3;
        System.out.println("A soma das notas e igual a: " + soma);

        media = soma/3;
        System.out.println("A media final das notas e : " + media);
    }
}
