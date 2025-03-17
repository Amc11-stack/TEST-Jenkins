package OOPS;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        // Upcasting
//        Animal myDog = new Dog();
//        myDog.makeSound(); // Output: Dog barks

        Animal aa= new Dog();
        Dog d= (Dog) aa;
        d.fetch();
        d.makeSound();


    }
}

