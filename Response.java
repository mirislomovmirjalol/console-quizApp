import java.util.Scanner;

public class Response {
    static Scanner scanner = new Scanner(System.in);

    public static void welcoming() {
        System.out.println("Welcome to the quiz!\n");
    }

    public static String askName() {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        return name;
    }

    public static int askAge() {
        System.out.println("Please enter your age:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Gender askGender() {
        System.out.println("Please select your gender:");
        for (Gender gender : Gender.values()) {
            System.out.println(gender.getValue() + " - " + gender.getKey());
        }
        int answer = scanner.nextInt();
        Gender gender = Gender.getGenderKey(answer);
        return gender;
    }

    public static void showMenu() {
        System.out.println("1. Start the quiz");
        System.out.println("2. Show the leaderboard");
        System.out.println("3. Exit");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" -> {
                Menu.startQuiz();
            }
            case "2" -> {
                Menu.showLeaderBoard();
            }
            case "3" -> {
                Menu.exit();
            }
            default -> {
                System.out.println("Please enter a valid number!");
                showMenu();
            }
        }
    }

    public static void finishingQuiz(User user) {
        System.out.println("You finished quiz!\n");
        System.out.println("Your score is: " + user.getScore());
        System.out.println("Good job " + user.getName() + "!");
    }
}
