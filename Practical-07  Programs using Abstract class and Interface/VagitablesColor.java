
/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a
java program that demonstrates how to establish this class hierarchy. Declare one instance
variable of type String that indicates the color of a vegetable. Crete and display instances of
these objects. Override the toString() method of object to return a string with the name of
vegetable and its color*/

abstract class vegetable {
    String color;

    public vegetable(String color) {
        this.color = color;
        System.out.println("color : " + "vegitable : ");
    }

    public String toString() {
        return ("vegitable :" + getClass().getSimpleName() + "color : " + color);
    }
}

/**
 * 
 */
class Potato extends vegetable {
    public Potato(String color) {
        super(color);
    }

}

/**
 * 
 */
class Brinjal extends vegetable {
    public Brinjal(String color) {
        super(color);
    }
}

/**
 * InnerVagitablesColor
 */
class Tomato extends vegetable {
    public Tomato(String color) {
        super(color);
    }

}

public class VagitablesColor {
    public static void main(String[] args) {
        Potato p = new Potato("Brown");
        Brinjal b = new Brinjal("purple");
        Tomato t = new Tomato("Red");

        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }

}
