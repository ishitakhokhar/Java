
/*Declare a class called book having author_name as private data member. Extend book class to
have two sub classes called book_publication & paper_publication. Each of these classes have
private member called title. Write a complete program to show usage of dynamic method
dispatch (dynamic polymorphism) to display book or paper publications of given author.Use
command line arguments for inputting data.*/

class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    void display() {

    }
}

class book_publication
        extends Book {
    private String title;

    book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;

    }

    void display() {
        System.out.println("book publication");
        System.out.println("Author= " + super.author_name);
        System.out.println("Title:" + title);
    }
}

class paper_publication extends Book {
    private String title;

    paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    void display() {
        System.out.println("book publication");
        System.out.println("Author= " + super.author_name);
        System.out.println("Title:" + title);
    }
}

public class Book_DMD {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("dgh");
        }
        String author_name = args[0];
        String publicationType = args[1];
        String title = args[2];

        Book publication;
        if (publicationType.equalsIgnoreCase("book")) {
            publication = new book_publication(author_name, title);
        } else if (publicationType.equalsIgnoreCase("paper")) {
            publication = new paper_publication(author_name, title);
        } else {
            System.out.println("Invalid publication type. Please choose 'book' or 'paper'.");
            return;
        }

        publication.display();
    }
}
