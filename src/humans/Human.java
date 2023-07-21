package humans;

public class Human {
    String name;
    String eyeColor;
    int age;
    int heightInInches;


    public Human() {

    }

    public Human(String name, String eyeColor, int age, int heightInInches) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working...");
    }
}
