import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your favorite actor:");
        String favoriteActor = scanner.nextLine();

        System.out.printf("UserProfile created for %s with favorite actor %s.%n", name, favoriteActor);
    }
}
