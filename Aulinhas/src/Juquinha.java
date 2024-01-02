import java.util.Scanner;

public class Juquinha {

  double totalDinheiroAPagar;

  public static void main(String[] args) {

    double valorNormal = 1.30;
    double valorDesconto = 1.00;

    System.out.println("Quantas macãs você tá comprando, Juquinha?");

    Scanner tela = new Scanner(System.in);

    double macas = tela.nextInt();

    if (macas >= 12) {

      double valorFinal = macas * valorDesconto;
      System.out.println(
          "Você está pagando apenas R$1,00 por macã, dando um total de R$" + valorFinal);

    } else {
      double valorFinal = macas * valorNormal;
      System.out.println("Você está pagando R$1,30 por macã, dando um total de R$" + valorFinal);
    }


  }
}
