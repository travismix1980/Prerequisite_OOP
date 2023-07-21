package animals;

public class Animal {
    private String species;
    private String furColor;
    private int age;
    private int numOfLegs;
    private boolean isDangerous;

    public Animal(String species, String furColor, int age, int numOfLegs, boolean isDangerous) {
        this.species = species;
        this.furColor = furColor;
        this.age = age;
        this.numOfLegs = numOfLegs;
        this.isDangerous = isDangerous;
    }

    public void speak(){
        System.out.println("Hello, I am a " + species);
        System.out.println("My fur is " + furColor);
        System.out.println("I am " + age + " years old");
        System.out.println("I have " + numOfLegs + " legs");
        System.out.println("I am dangerous? " + isDangerous);
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void eat() {
        System.out.println("Eating...");
    }
}
