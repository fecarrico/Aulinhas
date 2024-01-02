import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args){



        int[] tomada = new int[4];

        Scanner sc = new Scanner (System.in);

        for (int j=0;j<tomada.length;j++)
        {
        tomada[j] = sc.nextInt();
        }

        System.out.println(tomada[0]+tomada[1]+tomada[2]+tomada[3]-3);

    }

}
