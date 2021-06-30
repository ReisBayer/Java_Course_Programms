package ObjOrPro;

public class Core {

    public static void main(String[] args){


        /*
        int tmp = MathHelper.min(123, 321);
        System.out.println(tmp);

        double tmp2 = MathHelper .min(5.5, 6.5);
        System.out.println(tmp2);
         */

        Car c1 = new Car("BMW", 300);
        c1.drive();

        Car c2 = new Car("Fiat");
        c2.drive();


        /*
        Player p1 = new Player("Erik", 12);
        Player p2 = new Player("Monika", 13);

        int n = p1.getNumberOfCards();
        System.out.println(n);


        //p1.playCard();

        /*
        p1.printPlayerInfo();
        p2.printPlayerInfo();
         */
    }

}
