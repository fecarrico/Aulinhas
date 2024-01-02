import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {

    System.out.println("Insira o primeiro número que deseja somar");

    Scanner tela = new Scanner(System.in);

    int num1 = tela.nextInt();

    System.out.println("O primeiro número é:\n " + num1);

    System.out.println("Agora insira o segundo número");

    int num2 = tela.nextInt();

    System.out.println(num1 + num2);
  }
}
