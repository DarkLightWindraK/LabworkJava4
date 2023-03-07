import javax.lang.model.element.UnknownElementException;

public enum Gender {
    MALE, FEMALE;

    public static Gender getGenderByString(String str) {
        return switch (str.trim().toLowerCase()) {
            case "male" -> MALE;
            case "female" -> FEMALE;
            default -> throw new IllegalArgumentException("Gender must be male or female");
        };
    }
}
