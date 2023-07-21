package animals;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", "brown", 3, 4, false);
        Animal cat = new Animal("Cat", "orange", 7, 4, true);
        dog.speak();
        dog.eat();
        dog.walk();
        cat.speak();
        cat.eat();
        cat.walk();
    }
}