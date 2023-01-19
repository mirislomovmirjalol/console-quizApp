import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();
        Data data = new Data();
        data.readQuestionsFromFile(quiz);
        data.readUsersFromFile();


        Response response = new Response();

        Response.welcoming();
        Menu.mainMenu();
    }
}
