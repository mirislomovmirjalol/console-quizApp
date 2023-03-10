import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class

public class Data {
    private static final String questionsPath = "src/questions.csv";
    private static final String usersPath = "src/users.csv";


    static ArrayList<User> users = new ArrayList<User>();


    /*
        for implementing this function, I used this link:
        https://www.w3schools.com/java/java_files_read.asp
    */
    public static void readQuestionsFromFile(Quiz quiz) {
        try {
            /*
                if file already exists will do nothing
                https://stackoverflow.com/questions/9620683/java-fileoutputstream-create-file-if-not-exists
            */
            File file = new File(questionsPath);
            file.createNewFile();
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(";");
                quiz.addQuestion(new Question(data[0], data[1], data[2].split(",")));
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readUsersFromFile() {
        try {
            File file = new File(usersPath);
            file.createNewFile();
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                Gender gender = Gender.convertStringToGenderType(data[2]);
                int score = Integer.parseInt(data[3]);
                User user = new User(name, age, gender);
                user.setScore(score);
                users.add(user);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void saveUserToFile(User newUser) {
        readUsersFromFile();
        try {
            FileWriter writer = new FileWriter(usersPath);
            for (User user : users) {
                writer.write(user.getName() + "," + user.getAge() + "," + user.getGender().getKey() + "," + user.getScore() + "\n");
            }
            writer.write(newUser.getName() + "," + newUser.getAge() + "," + newUser.getGender().getKey() + "," + newUser.getScore() + "\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
