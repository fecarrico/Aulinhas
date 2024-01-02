import java.util.Objects;
import java.util.Scanner;

public class NextPalindrome {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int testes = sc.nextInt();

    int[] listaDeNumeros = new int[testes];

    for (int i = 0; i < testes; i++) {

      listaDeNumeros[i] = sc.nextInt();

    }

    for (int i = 0; i < testes; i++) {

      boolean palindrome = false;

      while (!palindrome) {

        listaDeNumeros[i]++;
        boolean iguais = true;

        // transformar o próximo número em array

        String[] numeroEmArray = String.valueOf(listaDeNumeros[i]).split("");

        int quantidadeDeDigitos = numeroEmArray.length;

        // dividir array em dois para comparar primeiro e ultimo digito

        int digitoAtual;
        int left, right;

        for (digitoAtual = 0; digitoAtual < (quantidadeDeDigitos / 2); digitoAtual++) {
          left = digitoAtual;
          right = quantidadeDeDigitos - digitoAtual - 1;

          // comparando primeiro e ultimo digito

          if (!Objects.equals(numeroEmArray[left], numeroEmArray[right])) {
            iguais = false;
            break;
          }
        }
        if (iguais) {
          palindrome = true;
        }
      }
      }
      for (int i = 0; i < testes; i++) {
          System.out.println(listaDeNumeros[i]);
    }
  }
  }



