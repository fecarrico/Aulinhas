import java.util.Scanner;

public class MultiplaEscolha {
  public static void main(String[] args) {

    // a nota 1 é maior igual que zero e menor igual que 10?
    // se sim, pedir nota dois
    // repetir para nota 2

    System.out.println("Insira suas notas em sequência:");
    Scanner tela = new Scanner(System.in);

    int nota1 = tela.nextInt();

    while ((nota1 < 0) || (nota1 > 10)) {
      System.out.println("Insira uma nota válida entre 0 e 10");
      nota1 = tela.nextInt();
    }

    int nota2 = tela.nextInt();

    while ((nota2 < 0) || (nota2 > 10)) {
      System.out.println("Insira uma nota válida entre 0 e 10");
      nota2 = tela.nextInt();
    }

    int media = (nota1 + nota2) / 2;

    switch (media) {
      case (7):
      case (8):
      case (9):
      case (10):
        System.out.println("Aprovado");
        break;

      case (3):
      case (2):
      case (1):
      case (0):
        System.out.println("Reprovado");
        break;

      case (6):
      case (5):
      case (4):
        System.out.println("Está na final");
        break;

      default:
        System.out.println("Valor inválido");
    }
  }
}
