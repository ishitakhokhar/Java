// Write a Java program to create an interface Playable with a method play() that takes no
// arguments and returns void. Create three classes Football, Volleyball, and Basketball that
// implement the Playable interface and override the play() method to play the respective
// sports.
/**
 * 
 */
interface Playable {
    void play();

}

/**
 * InnerGame
 */
class Football implements Playable {

    public void play() {
        System.out.println("Football");
    }
}

/**
 *  
 */
class Volleyball implements Playable {

    public void play() {
        System.out.println("Volleyball");
    }
}

/**
 * 
 */
class Basketball implements Playable {
    public void play() {
        System.out.println("Basketball");
    }

}

public class Game {
    public static void main(String[] args) {
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}
