import java.util.*;

public class NextVersusNextLine {

  public static void main(String[] args) {

    String sampleText = 
        " Programmers love Java!\n"
      + " User input with Java is so easy!\n"
      + " Just use the Scanner class.\n"
      + " Or maybe the Console or JOptionPane?\n";

    Scanner scanner = new Scanner(sampleText);

    System.out.println("First call : " + scanner.nextLine());
    System.out.println("Second call: " + scanner.nextLine());
    System.out.println("Third call : " + scanner.next());
    System.out.println("Fourth call: " + scanner.next());

    scanner.close();

  }
}