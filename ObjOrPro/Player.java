package ObjOrPro;

public class Player {

    private String name;
    private int numberOfCards;

    Player(String n, int c){
        name = n;
        numberOfCards = c;
    }

    public int getNumberOfCards(){
        return numberOfCards;
    }

    public void setName(String n){
        name = n;
    }

    public void playCard(){
        numberOfCards--;
    }

    public void printPlayerInfo(){
        System.out.println(name + " (" + numberOfCards + ")");
    }

}
