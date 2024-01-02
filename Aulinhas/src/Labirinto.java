import java.util.Arrays;
import java.util.Scanner;

public class Labirinto {
    public static void main(String[] args){

        String personagem = " ⛝ ";
        String content = " ⛶ ";
        String key = " ⚿ ";
        String rastroDireta = " ᗒ ";
        String rastroBaixo = " ᗐ ";

        int linha = 0;
        int coluna = 0;

        String[][] mapa = {
            {content, content, content},
            {content, content, content},
            {content, content, key},
        };

        int largura = mapa[0].length;
        int altura = mapa.length;

        mapa[linha][coluna] = (personagem);

        // tela inicial

        System.out.println( mapa[0][0] + mapa[0][1] + mapa[0][2]);
        System.out.println( mapa[1][0] + mapa[1][1] + mapa[1][2]);
        System.out.println( mapa[2][0] + mapa[2][1] + mapa[2][2]);

        // game

        System.out.println("Para onde você quer ir?");
        System.out.println("Utilize os comandos W(↑) A(←) S(↓) D(→) para se mover.");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<9;i++){

        String comando = sc.next();

        switch (comando) {
            case ("d"),("D") -> coluna = (coluna+1);
            case ("s"),("S") -> linha = (linha+1);
            case ("w"),("W") -> linha = (linha-1);
            case ("a"),("A") -> coluna = (coluna-1);
        }
        mapa[linha][coluna] = (personagem);

        //// se qualquer casa for menor que a casa que possui personagem e possuir personagem, trocar para rastro.

if (coluna !=0){
            if (mapa[linha][coluna-1].equals(personagem)){
                mapa[linha][coluna-1] = (rastroDireta);}
}else if(linha != 0){
            if (mapa[linha-1][coluna].equals(personagem)){
                mapa[linha-1][coluna] = (rastroBaixo);}

}
if(mapa[2][2].equals(personagem)){
    personagem = "⚝";
    System.out.println("ganhou");
}
        System.out.println( mapa[0][0] + mapa[0][1] + mapa[0][2]);
        System.out.println( mapa[1][0] + mapa[1][1] + mapa[1][2]);
        System.out.println( mapa[2][0] + mapa[2][1] + mapa[2][2]);
        }

    }
}
