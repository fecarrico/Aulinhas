import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Circulos {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int qtd = sc.nextInt();

    char[] separador = null;

    char[][][] agrupamento = new char[qtd][2][1];

    for (int i = 0; i < qtd; i++) {

      String entrada = sc.next();

      separador = entrada.toCharArray();

      agrupamento[i][1] = separador;
    }
      for (int i = 0; i < qtd; i++) {

          int j = agrupamento[i][1].length;

          for (int k = 0; k<j; k++){

              if(agrupamento[i][1][k] == '1' || agrupamento[i][1][k] == '2' || agrupamento[i][1][k] == '3' || agrupamento[i][1][k] == '4' || agrupamento[i][1][k] == '5' || agrupamento[i][1][k] == '7' ){
                  agrupamento[i][1][k] = '0';
              }
              else if(agrupamento[i][1][k] == '6' || agrupamento[i][1][k] == '9' || agrupamento[i][1][k] == '0'){
                  agrupamento[i][1][k] = '1';
              }
              else if(agrupamento[i][1][k] == '8'){
                  agrupamento[i][1][k] = '2';
              }
          }
      }
    for (int i = 0; i < qtd; i++) {
        int j = agrupamento[i][1].length;
        int soma = 0;
        for (int k = 0; k < j; k++) {
            int valorNumerico = agrupamento[i][1][k] - '0';

            soma += valorNumerico;
        }
        System.out.println(soma);
    }
      }
}









