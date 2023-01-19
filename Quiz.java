import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + " - " + question.getOptions()[i]);
            }
            int answer = scanner.nextInt();
            checkAnswer(question, answer);
        }
    }

    public void checkAnswer(Question question, int answer) {
        //            https://stackoverflow.com/questions/15984623/java-comparing-ints-and-strings-performance
        if (question.getOptions()[answer - 1].equals(question.getAnswer())) {
            /*
                if you want to tell user that answer is correct, uncomment this code
                System.out.println("Correct!");
            */
//            User.score++;
            System.out.println("Correct!");

        }
            /*
                if you want to tell user that answer is incorrect, uncomment this Code
                else {
                    System.out.println("Incorrect!");
                }
            */
    }
}
