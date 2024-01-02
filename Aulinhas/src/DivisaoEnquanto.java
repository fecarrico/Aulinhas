import java.util.Scanner;

public class DivisaoEnquanto {

  public static void main(String[] args) {
    System.out.println("Insira um numerador:");

    Scanner tela = new Scanner(System.in);

    int numerador = tela.nextInt();

    System.out.println("Agora insira o divisor:");

    int divisor = tela.nextInt();

    int i = 0;
    while (divisor == 0 && i < 2) {
      System.out.println("Digite um numero valido");

      divisor = tela.nextInt();
      i = i + 1; // i++
    }

    System.out.println();

    System.out.println("O resultado da divisao é: " + numerador / divisor);
  }
}
