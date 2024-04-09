// Create interface EventListener with performEvent() method. Create MouseListener interface
// which inherits EventListener along with mouseClicked(), mousePressed(), mouseReleased(),
// mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits
// EventListener along with keyPressed(), keyReleased() methods. WAP to create EventDemo
// class which implements MouseListener and KeyListener and demonstrate all the methods of
// the interfaces.
interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();

    void mousePressed();

    void mouseReleased();

    void mouseMoved();

    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

/**
 * Ev
 */
class EventDemo implements MouseListener, KeyListener {
    public void performEvent() {
        System.out.println("perfomeevent");
    }

    public void mouseClicked() {
        System.out.println("mouseclicked");
    }

    public void mousePressed() {
        System.out.println("mousePressed");
    }

    public void mouseReleased() {
        System.out.println("mouseReleased");
    }

    public void mouseMoved() {
        System.out.println("mousemoved");
    }

    public void mouseDragged() {
        System.out.println("mouseDragged");
    }

    public void keyPressed() {
        System.out.println("keyPressed");
    }

    public void keyReleased() {
        System.out.println("keyReleased");
    }
}

public class MouseClick {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
