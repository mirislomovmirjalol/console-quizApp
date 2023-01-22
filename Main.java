import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        data.readUsersFromFile();


        Response response = new Response();

        Response.welcoming();
        Menu.mainMenu();
    }
}
