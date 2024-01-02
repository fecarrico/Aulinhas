import java.util.Scanner;

public class Niver {
  public static void main(String[] args) {

    // Elabore um programa que leia o ano de nascimento de uma pessoa e imprima na tela a idade que
    // ela terá daqui a 50 anos.
    //
    // Solicitar o ano de nascimento
    // Subritair do ano atual
    // Somar 50
    // Exibir

    int anoAtual = 2023;

    System.out.println("Qual é o ano do seu nascimento?");
    Scanner tela = new Scanner(System.in);

    int anoNiver = tela.nextInt();

    int daqui50 = (anoAtual - anoNiver) + 50;

    System.out.println("Você terá " + daqui50 + " em 50 anos!");
  }
}
