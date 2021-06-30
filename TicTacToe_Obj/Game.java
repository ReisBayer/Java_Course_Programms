package TicTacToe_Obj;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private static Game instance;

    int playerWon = 0;
    int zellenFrei = 9;
    int[][] field;
    Scanner input = new Scanner(System.in);
 /*   int np[] = new int[2];
    int sp[] = new int[2]; */

    private Game(){

    }

    public static Game getInstance(){

        if(instance == null){
            instance =  new Game();
        }
        return instance;

    }


    public int[][] startGame(){

        int[][] field = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        this.field = field;
        return field;

    }



    public void showField(){

        for (int[] row : field) {
            System.out.println(Arrays.toString(row));
        }

    }

    public void turn(String np1, String np2, int sp1, int sp2){

        //for(int i = 0; i <= 1; i++) {

            System.out.println("Spieler " + np1 + " ist dran!");

            System.out.println("Zeile: ");
            int zeile = input.nextInt() - 1;


            while (zeile < 0 || zeile > 2) {
                System.out.println("Bitte eine Gültige Zeile angeben!");

                System.out.println("Zeile: ");
                zeile = input.nextInt() - 1;
            }


            System.out.println("Spalte: ");
            int spalte = input.nextInt() - 1;


            while (spalte < 0 || spalte > 2) {
                System.out.println("Bitte eine Gültige Spalte angeben!");

                System.out.println("Spalte: ");
                spalte = input.nextInt() - 1;
            }


            while (field[zeile][spalte] != 0) {
                System.out.println("Bitte ein freies Feld auswählen!");

                System.out.println("Zeile: ");
                zeile = input.nextInt() - 1;

                System.out.println("Spalte: ");
                spalte = input.nextInt() - 1;

            }

            field[zeile][spalte] = sp1;
            zellenFrei--;
        //}




        showField();
        if(checkGameEnd()){
            return;
        }


        System.out.println("Spieler " + np2 + " ist dran!");

        System.out.println("Zeile: ");
        zeile = input.nextInt() - 1;

        while (zeile < 0 || zeile > 2) {
            System.out.println("Bitte eine Gültige Zeile angeben!");

            System.out.println("Zeile: ");
            zeile = input.nextInt() - 1;
        }

        System.out.println("Spalte: ");
        spalte = input.nextInt() - 1;

        while (spalte <0 || spalte > 2) {
            System.out.println("Bitte eine Gültige Spalte angeben!");

            System.out.println("Spalte: ");
            spalte = input.nextInt() - 1;
        }

        while (field[zeile][spalte] != 0) {
            System.out.println("Bitte ein freies Feld auswählen!");

            System.out.println("Zeile: ");
            zeile = input.nextInt() - 1;

            System.out.println("Spalte: ");
            spalte = input.nextInt() - 1;

        }

        field[zeile][spalte] = sp2;
        zellenFrei--;

        showField();
    }
/*
    public void turn2(String np2, int sp2){

        for(int i = 0; i <= 1; i++) {

            System.out.println("Spieler " + np2 + " ist dran!");

            System.out.println("Zeile: ");
            int zeile = input.nextInt() - 1;

            System.out.println("Spalte: ");
            int spalte = input.nextInt() - 1;

            while (field[zeile][spalte] != 0) {
                System.out.println("Bitte ein freies Feld auswählen!");

                System.out.println("Zeile: ");
                zeile = input.nextInt() - 1;

                System.out.println("Spalte: ");
                spalte = input.nextInt() - 1;

            }

            field[zeile][spalte] = sp2;
            zellenFrei--;
        }

    }
*/

    public boolean checkGameEnd(){
        for (int x = 0; x < 3; x++) {
            if (field[x][0] != 0 && field[x][0] == field[x][1] && field[x][0] == field[x][2]) {
                playerWon = field[x][0];
                break;
            }
        }

        for (int x = 0; x < 3; x++) {
            if (field[0][x] != 0 && field[0][x] == field[1][x] && field[0][x] == field[2][x]) {
                playerWon = field[0][x];
                break;
            }
        }


        if (field[0][0] != 0 && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
            playerWon = field[0][0];
        } else if (field[0][2] != 0 && field[0][2] == field[1][1] && field[0][2] == field[2][0]) {
            playerWon = field[0][2];
        }

        if(playerWon == 1){
            return true;
        }
        else if(playerWon == 2){
            return true;
        }
        else if(playerWon == 0 && zellenFrei == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public void checkWinner(String np1, String np2){
        if(playerWon == 1){
            System.out.println( np1 + " hat gewonnen!");
        }
        else if(playerWon == 2){
            System.out.println( np2 + " hat gewonnen!");
        }
        else{
            System.out.println( "Unentschieden!");
        }
    }


}
