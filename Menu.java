import java.util.Formatter;

public class Menu {
    public static void mainMenu() {
        Response.showMenu();
    }

    public static void startQuiz() {
        Quiz quiz = new Quiz();
        quiz.start();
    }

    public static void showLeaderBoard() {
        Formatter formatter = new Formatter();
        Data data = new Data();
        data.readUsersFromFile();
        String[] titles = {"Name", "Age", "Score"};
        formatter.format("%-20s %-5s %-10s\n", titles[0], titles[1], titles[2]);

        System.out.println("Leaderboard:");

        for (User user : data.users) {
            System.out.println(user.getName() + user.getAge() + user.getScore());
        }
    }
}
