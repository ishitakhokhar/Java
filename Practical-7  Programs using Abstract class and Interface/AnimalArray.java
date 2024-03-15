// The Transport interface declares a deliver () method. The abstract class Animal is the super
// class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is implemented by
// the Camel and Donkey classes. Write a test program that initialize an array of four Animal
// objects. If the object implements the Transport interface, the deliver () method is invoked.
interface Transport {
    void deliver();

}

abstract class Animal {
}

class Tiger extends Animal {

}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Camel is good animal");
    }
}

class Deer extends Animal {

}

class Donky extends Animal implements Transport {
    public void deliver() {
        System.out.println("Donky is good animal");
    }
}

public class AnimalArray {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
            new Tiger(),
            new Camel(),
            new Deer(),
            new Donky(),
        };
        for (Animal animal : animals) {
            if (animal instanceof Transport){

            }
        }
    }
}
