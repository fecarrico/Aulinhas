public class NumerosRomanos {
  public static void main(String[] args) {

    String s = "III";

    int[] y = s.chars().toArray();

    int length = y.length - 1;

    // percorrer e transformar

    for (int i = 0; i < length; i++) {

      switch (y[i]) {
        case ('I') -> y[i] = 1;
        case ('V') -> y[i] = 5;
        case ('X') -> y[i] = 10;
        case ('L') -> y[i] = 50;
        case ('C') -> y[i] = 100;
        case ('D') -> y[i] = 500;
        case ('M') -> y[i] = 1000;
      }
    }
    // tratar subtrações

    for (int i = 0; i < length; i++) {

      if (y[i] < y[i + 1]) {
        y[i] = y[i] * -1;
      }
      }

      // somar

      int soma = 0;

      for (int i = 0; i < length; i++) {

        int result = y[i] - '0';
        soma += result;

    }

      System.out.println(soma);

}
}
