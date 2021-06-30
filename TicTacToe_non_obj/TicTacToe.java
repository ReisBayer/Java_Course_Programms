package Aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*
        0 -> kein Spieler hat Feld belegt
        1 -> Spieler X
        2 -> Spieler O
         */

        int playerWon = 0;
        int zelleFrei = 9;

        int[][] game = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        for (int[] row : game) {
            System.out.println(Arrays.toString(row));
        }

        while (playerWon == 0 && zelleFrei != 0) {

            for (int spieler = 1; spieler <= 2; spieler++) {

                System.out.println("Spieler " + spieler + " ist dran!");

                System.out.println("Zeile: ");
                int zeile = input.nextInt() - 1;

                System.out.println("Spalte: ");
                int spalte = input.nextInt() - 1;

                while (game[zeile][spalte] != 0) {
                    System.out.println("Bitte ein freies Feld auswählen!");

                    System.out.println("Zeile: ");
                    zeile = input.nextInt() - 1;

                    System.out.println("Spalte: ");
                    spalte = input.nextInt() - 1;

                }

                game[zeile][spalte] = spieler;
                zelleFrei--;


                for (int x = 0; x < 3; x++) {
                    if (game[x][0] != 0 && game[x][0] == game[x][1] && game[x][0] == game[x][2]) {
                        playerWon = game[x][0];
                        break;
                    }
                }

                for (int x = 0; x < 3; x++) {
                    if (game[0][x] != 0 && game[0][x] == game[1][x] && game[0][x] == game[2][x]) {
                        playerWon = game[0][x];
                        break;
                    }
                }


                if (game[0][0] != 0 && game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
                    playerWon = game[0][0];
                } else if (game[0][2] != 0 && game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
                    playerWon = game[0][2];
                }


                for (int[] row : game) {
                    System.out.println(Arrays.toString(row));
                }

/*
                if(playerWon != 0){
                    System.out.println("Spieler " + playerWon + " hat gewonnen!");

                }
                else if(playerWon == 0 && zelleFrei == 0){
                    System.out.println(("Unentschieden!"));

                }

 */


            }
        }

        if (playerWon != 0) {
            System.out.println("Spieler " + playerWon + " hat gewonnen!");

        } else if (playerWon == 0 && zelleFrei == 0) {
            System.out.println(("Unentschieden!"));
        }


    }
}
