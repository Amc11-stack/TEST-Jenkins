class Animal {
    void bark() {
        System.out.println("Animal makes a sound");
    }
    void bark(int a) {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends AnimalPlant {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Java_Programme {
    public static void main(String[] args) {
        AnimalPlant a = new Dog();   // Upcasting: Dog → Animal (implicit)


        // Downcasting: Animal → Dog (explicit)
        Dog d = (Dog) a;
        d.bark();               // Safe: 'a' is actually a Dog
    }
}
