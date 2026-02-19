class AnimalPlant {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class DogPlant extends AnimalPlant {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends AnimalPlant {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalPlant dog = new DogPlant();
        AnimalPlant cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}