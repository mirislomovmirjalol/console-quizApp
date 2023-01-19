public class User {
    private String name;
    private int score = 0;;
    private int age;
    private Gender gender;


    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
    public Gender getGender() {
        return gender;
    }
}
