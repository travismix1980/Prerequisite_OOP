package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Fish fish = new Fish(1, "male", 1);
        Chicken chicken = new Chicken(3, "female", 10);
        Sparrow sparrow = new Sparrow(6, "male", 3);
        IFlyable flyingBird = new Sparrow(3,"female", 11);
        flyingBird.fly();
        moveAnimal(fish);
        moveAnimal(chicken);
        moveAnimal(sparrow);

    }
    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
