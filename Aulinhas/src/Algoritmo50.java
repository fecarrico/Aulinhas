import java.util.Scanner;

public class Algoritmo50 {
  public static void main(String[] args) {

    int soma = 0;
    for (int i = 1; i < 51; i++) {
      if ((i%2 == 1) && (i%3 == 0)){
        soma = soma + i;
      }
    }
    System.out.println(soma);

    // É par ou ímpar?

//    System.out.println("Insira um número:");
//
//    Scanner sc = new Scanner(System.in);
//
//    double numero = sc.nextInt();
//
//    if ((numero%2 == 1) && (numero%3 == 0)){
//      System.out.println("número ímpar e multiplo de 3");
//    }else {
//      System.out.println("invalido");
//    }

  }
}
