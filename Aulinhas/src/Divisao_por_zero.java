import java.util.Scanner;

public class Divisao_por_zero {
  public static void main(String[] args) {

    // Leia dois números inteiros e execute a divisão. Caso o divisor seja zero, imprima na tela a
    // mensagem “Não existe divisão por zero”.

    // inserir o primeiro numero
    // inserir o segundo numero
    // realizar a divisao
    // se o divisor for zero exibir mensagem
    // se não for zero, exibir resultado

    System.out.println("Insira um numerador:");

    Scanner tela = new Scanner(System.in);

    int numerador = tela.nextInt();

    System.out.println("Agora insira o divisor:");

    double divisor = tela.nextInt();

    if (divisor == 0) {
      System.out.println("O divisor não pode ser igual a zero");
      System.out.println("Insira outro número diferente de zero");
      divisor = tela.nextInt();
      System.out.println("O resultado da divisão é " + (numerador / divisor));

    } else {

      System.out.println("O resultado da divisão é " + (numerador / divisor));
    }
  }
}
