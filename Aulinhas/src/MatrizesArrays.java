import java.util.Scanner;

public class MatrizesArrays {
  public static void main(String[] args) {


    int[][] matriz = new int[2][3];


    Scanner sc = new Scanner(System.in);

    Aluno[] alunos = new Aluno[5];


    for (int i = 0; i < 5; i++) {

      System.out.println("insira o nome do aluno:");
      alunos[i].nome = sc.next();
      System.out.println("insira a nota do aluno " + alunos[i].nome + " :" );
      alunos[i].nota = sc.nextDouble();
    }
    for (int i = 0; i < 5; i++){
      System.out.println("Aqui estão as notas dos alunos: \n" + alunos[i].nome + ": " + alunos[i].nota);
    }

//    int[] numeros = new int[10];
//
//    for (int i = 0; i < 10; i++) {
//      numeros[i] = 1;
//    }
//    for (int i = 0; i < 10; i++){
//      System.out.println(numeros[i]);
//    }

    //    int tam = 5;
    //    double[] notas = new double[tam];
    //    for (int i = 0; i < tam; i++) {
    //      System.out.println("Digite sua nota");
    //      notas[i] = sc.nextDouble();
    //    }
    //
    ////    System.out.println(notas);
    //    for (int i = 0; i < tam; i++) {
    //      System.out.println(notas[i]);
    //    }
  }
}
