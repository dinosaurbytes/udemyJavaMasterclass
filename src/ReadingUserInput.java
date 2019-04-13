import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();


        scanner.close();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
    }

}
