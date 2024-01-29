import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr letter");
        char letter = sc.next().charAt(0);
        if (vowel(letter))
            System.out.println("Letter is vowel");
        else
            System.out.println("Letter is Consonants");
        sc.close();
    }

    public static boolean vowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
                || letter == 'E' || letter == 'I' || letter == 'O'
                || letter == 'U')
            return true;
        return false;
    }
}
