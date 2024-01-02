import java.util.Scanner;

public class Calcoperacoes {
  public static void main(String[] args) {

    System.out.println("Insira o primeiro número com o qual deseja operar:");

    Scanner sc = new Scanner(System.in);

    double primeiroOperador = sc.nextDouble();

    System.out.println("Agora insira o segundo número com o qual deseja operar:");

    double segundoOperador = sc.nextDouble();

    System.out.println(
        "Qual é o tipo de operacão que deseja realizar? Utilize os sinais de +, -, * e /.");

    String operacao = sc.next();

    switch (operacao) {
      case ("+"):
        System.out.println(
            "O resultado de "
                + primeiroOperador
                + " mais "
                + segundoOperador
                + " é igual a "
                + (primeiroOperador + segundoOperador));
        break;
      case ("-"):
        System.out.println(
            "O resultado de "
                + primeiroOperador
                + " menos "
                + segundoOperador
                + " é igual a "
                + (primeiroOperador - segundoOperador));
          break;
      case ("*"):
        System.out.println(
            "O resultado de "
                + primeiroOperador
                + " vezes "
                + segundoOperador
                + " é igual a "
                + (primeiroOperador * segundoOperador));
          break;
      case ("/"):
        System.out.println(
            "O resultado de "
                + primeiroOperador
                + " dividido por "
                + segundoOperador
                + " é igual a "
                + (primeiroOperador / segundoOperador));
          break;
      default:
        System.out.println("O sinal da operacão é inválido. ");
    }
  }
}
