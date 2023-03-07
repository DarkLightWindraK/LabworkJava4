public class Main {
    public static void main(String[] args) {
        var list = PersonReader.read("src/foreign_names.csv");
        System.out.println(list.size());
    }
}