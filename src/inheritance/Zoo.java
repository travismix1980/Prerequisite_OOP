package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Fish fish = new Fish(1, "male", 1);
        fish.swim();
        fish.eat();
        fish.sleep();

        Chicken chick1 = new Chicken(3, "female", 10);
        chick1.eat();

        Sparrow sparrow = new Sparrow(6, "male", 3);
        sparrow.fly();
    }
}
