package TicTacToe_Obj;


import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {

        //Von beiden Spielern jeweils den Namen und die Seite (gewünschtes Symbol) abfragen

        System.out.println("Bitte Spielernamen 1 angeben: ");
        Scanner scan = new Scanner(System.in);
        String n1 = scan.next();

        int s1 = 1;

        Player p1 = new Player(n1, s1);


        System.out.println("Bitte Spielernamen 2 angeben: ");
        scan = new Scanner(System.in);
        String n2 = scan.next();

        if (n1.equals(n2)) {
            n2 = n2 + "_2";
        }

        int s2 = 2;

        Player p2 = new Player(n2, s2);

        //--Ende Spieler Inizialisierung--


        Game gm = Game.getInstance();
        gm.startGame();
        while (!gm.checkGameEnd()) {
            gm.turn(n1, n2, s1, s2);
        }
        gm.checkWinner(n1, n2);
    }
}

