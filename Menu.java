import java.util.Formatter;

public class Menu {
    public static void mainMenu() {
        Response.showMenu();
    }

    public static void startQuiz() {
        User user = new User(Response.askName(), Response.askAge(), Response.askGender());
        Quiz quiz = new Quiz();
        Data.readQuestionsFromFile(quiz);
        quiz.start(user);
        Data.saveUserToFile(user);
        Response.finishingQuiz(user);
    }

    public static void showLeaderBoard() {
        Formatter formatter = new Formatter();
        Data.readUsersFromFile();
        String[] titles = {"Name", "Age", "Score"};
        formatter.format("%-20s %-5s %-10s\n", titles[0], titles[1], titles[2]);

        System.out.println("Leaderboard:");

        for (User user : Data.users) {
            System.out.println(user.getName() + " " + user.getAge() + " " + user.getScore());
        }
    }
}
