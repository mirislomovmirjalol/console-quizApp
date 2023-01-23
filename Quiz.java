import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz {
//    set isRandomQuestions to true if you want to randomize the questions
    private Boolean isRandomQuestions = false;
    ArrayList<Question> questions = new ArrayList<Question>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start(User user) {
        Scanner scanner = new Scanner(System.in);
        if (isRandomQuestions) {
            Collections.shuffle(questions, new Random());
        }
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + " - " + question.getOptions()[i]);
            }
            int answer = scanner.nextInt();
            checkAnswer(question, answer, user);
        }
    }

    public void checkAnswer(Question question, int answer, User user) {
        //            https://stackoverflow.com/questions/15984623/java-comparing-ints-and-strings-performance
        if (question.getOptions()[answer - 1].equals(question.getAnswer())) {
            /*
                if you want to tell user that answer is correct, uncomment this code
                System.out.println("Correct!");
            */
//            User.score++;
            System.out.println("Correct!");
            user.setScore(user.getScore() + 1);
        }
            /*
                if you want to tell user that answer is incorrect, uncomment this Code
                else {
                    System.out.println("Incorrect!");
                }
            */
    }
}
