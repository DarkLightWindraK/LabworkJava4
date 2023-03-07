
public enum Gender {
    MALE, FEMALE;
    /**
     * Получает значение Gender по строковому представлению
     * @param str строковое представление пола
     * @return Gender
     * @throws IllegalArgumentException если передана неверная строка
     */
    public static Gender getGenderByString(String str) {
        return switch (str.trim().toLowerCase()) {
            case "male" -> MALE;
            case "female" -> FEMALE;
            default -> throw new IllegalArgumentException("Gender must be male or female");
        };
    }
}
