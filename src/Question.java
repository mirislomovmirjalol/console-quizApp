public class Question {
    private String question;
    private String answer;
    private String[] options;

    public Question(String question, String answer, String[] options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String[] getOptions() {
        return options;
    }
}
