package ObjOrPro;

public class Car {

    private String brand;
    private int hp;

    Car(String brand, int hp){
        this.brand = brand;
        this.hp = hp;

    }

    Car(String brand){
        this.brand = brand;
        this.hp = 150;
    }

    public void drive(){
        System.out.println("Ein " + brand + " fährt mit " + hp + " PS");
    }

}
