public class Department {
    public long id;
    public String name;

    public Department(String name) {
        this.id = getNewId();
        this.name = name;
    }

    public static long nextID = 1;
    /**
     * Генерирует уникальный id подразделения
     * @return id
     */
    public static long getNewId() {
        return nextID++;
    }
}
