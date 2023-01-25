import java.util.Objects;

public enum Gender {
//    You can add more genders here.
    FEMALE("Female", 1),
    MALE("Male", 2),
    NOT_PREFERRING_TO_SAY("Not prefer to say", 3),
    ;

    private final String key;
    private final Integer value;

    Gender(String key, int value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public static Gender getGenderKey(int key) {
        switch (key) {
            case 1 -> {
                return FEMALE;
            }
            case 2 -> {
                return MALE;
            }
        }
        return NOT_PREFERRING_TO_SAY;
    }

    public static Gender convertStringToGenderType(String data) {
        for (Gender gender : Gender.values()) {
            if (Objects.equals(data, gender.key)) {
                return gender;
            }
        }
        return NOT_PREFERRING_TO_SAY;
    }
}
