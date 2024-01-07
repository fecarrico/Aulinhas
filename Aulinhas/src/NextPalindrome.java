
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

        int[] numeroEmArray = Integer.toString(listaDeNumeros[i]).chars().toArray();


          int quantidadeDeDigitos = numeroEmArray.length;

          // dividir array em dois para comparar primeiro e ultimo digito

          int digitoAtual;
          int right = quantidadeDeDigitos - 1;

          for (digitoAtual = 0; digitoAtual < right; digitoAtual++) {
            right = quantidadeDeDigitos - digitoAtual - 1;

            // comparando primeiro e ultimo digito

            if (!Objects.equals(numeroEmArray[digitoAtual], numeroEmArray[right])) {
              iguais = false;
              break;
            }
          }
          if (iguais) {
            if (numeroEmArray.length < 1000000) {
              palindrome = true;
            } else { listaDeNumeros[i] = 0;}
          }
        }
      }
      for (int i = 0; i < testes; i++) {
          System.out.println(listaDeNumeros[i]);
    }
  }
  }



