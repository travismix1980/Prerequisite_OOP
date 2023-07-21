package humans;
public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Tom", "brown", 25, 76);
        Human human2 = new Human("Joe", "blue", 42, 64);
        Human human3 = new Human("Rodger", "brown", 13, 70);

        human1.speak();
        human2.speak();
        human3.speak();

    }
}
