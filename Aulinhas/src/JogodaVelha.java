import java.util.Scanner;

public class JogodaVelha {
    public static void main(String[] args) {

        // jogadores

        String playerDavez = "P";
        String player1 = "X";
        String player2 = "O";

        // casas disponiveis
        String[] casa = {" "," "," "," "," "," "," "," "," "};


        // Jogo

        /////// Quem vai primeiro?

        System.out.println("Quem começa? X ou O?");

        Scanner tela = new Scanner(System.in);
        playerDavez = tela.next();

        if ( playerDavez.equals("X")  ||  playerDavez.equals("x") ){
            playerDavez = player1;

        }else {playerDavez = player2;
        }

        ///////// fim quem começa primeiro


        for (int rodada=0;rodada<9;rodada++){
            System.out.println("Jogador " + playerDavez + " faça sua jogada");
            System.out.println("\n \n     1   2   3  \n A   "+casa[0]+" | "+casa[1]+" | "+casa[2]+"  \n    ---|---|--- \n B   "+casa[3]+" | "+casa[4]+" | "+casa[5]+"  \n    ---|---|--- \n C   "+casa[6]+" | "+casa[7]+" | "+casa[8]+"  \n");

            String jogada = tela.next();

            switch (jogada) {
                case ("a1"), ("A1") -> casa[0] = playerDavez;
                case ("a2"), ("A2") -> casa[1] = playerDavez;
                case ("a3"), ("A3") -> casa[2] = playerDavez;
                case ("b1"), ("B1") -> casa[3] = playerDavez;
                case ("b2"), ("B2") -> casa[4] = playerDavez;
                case ("b3"), ("B3") -> casa[5] = playerDavez;
                case ("c1"), ("C1") -> casa[6] = playerDavez;
                case ("c2"), ("C2") -> casa[7] = playerDavez;
                case ("c3"), ("C3") -> casa[8] = playerDavez;
            }

            if (playerDavez.equals(player1) ){
                playerDavez = player2;
            }else{
                playerDavez = player1;
            }

            ////// checar vitoria

            if ((casa[0].equals("X") && casa[4].equals("X") && casa[8].equals("X")) || (casa[2].equals("X") && casa[4].equals("X") && casa[6].equals("X")) || (casa[0].equals("X") && casa[1].equals("X") && casa[2].equals("X")) || (casa[3].equals("X") && casa[4].equals("X") && casa[5].equals("X")) || (casa[6].equals("X") && casa[7].equals("X") && casa[8].equals("X")) || (casa[0].equals("X") && casa[3].equals("X") && casa[6].equals("X")) || (casa[1].equals("X") && casa[4].equals("X") && casa[7].equals("X")) || (casa[2].equals("X") && casa[5].equals("X") && casa[8].equals("X"))){

                System.out.println("Vitória do jogador X!!!!!");
                System.out.println("\n \n     1   2   3  \n A   "+casa[0]+" | "+casa[1]+" | "+casa[2]+"  \n    ---|---|--- \n B   "+casa[3]+" | "+casa[4]+" | "+casa[5]+"  \n    ---|---|--- \n C   "+casa[6]+" | "+casa[7]+" | "+casa[8]+"  \n");

                rodada = 8;
            }

            if ((casa[0].equals("O") && casa[4].equals("O") && casa[8].equals("O")) || (casa[2].equals("O") && casa[4].equals("O") && casa[6].equals("O")) || (casa[0].equals("O") && casa[1].equals("O") && casa[2].equals("O")) || (casa[3].equals("O") && casa[4].equals("O") && casa[5].equals("O")) || (casa[6].equals("O") && casa[7].equals("O") && casa[8].equals("O")) || (casa[0].equals("O") && casa[3].equals("O") && casa[6].equals("O")) || (casa[1].equals("O") && casa[4].equals("O") && casa[7].equals("O")) || (casa[2].equals("O") && casa[5].equals("O") && casa[8].equals("O"))){


                System.out.println("Vitória do jogador O!!!!!");
                System.out.println("\n \n     1   2   3  \n A   "+casa[0]+" | "+casa[1]+" | "+casa[2]+"  \n    ---|---|--- \n B   "+casa[3]+" | "+casa[4]+" | "+casa[5]+"  \n    ---|---|--- \n C   "+casa[6]+" | "+casa[7]+" | "+casa[8]+"  \n");

                rodada = 8;
            }


            }

        }


    }
