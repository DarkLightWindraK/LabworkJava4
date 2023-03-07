import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/**
 * Класс для чтения списка людей из файла
 */
public class PersonReader {
    /**
     * Читает список людей из файла
     * @param filePath путь к файлу
     * @return список людей
     * @throws IOException если чтение из файла не удалось
     */
    public static List<Person> read(String filePath) {
        List<Person> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                var person = new Person();
                person.id = Long.parseLong(data[0]);
                person.name = data[1];
                person.gender = Gender.getGenderByString(data[2]);
                person.birthday = data[3];
                var department = new Department(data[4]);
                person.department = department;
                person.salary = Double.parseDouble(data[5]);
                list.add(person);
            }
        } catch (IOException | NumberFormatException | IllegalFormatException e) {
            System.err.println("Ошибка при чтении файла");
            return list;
        }
        return list;
    }
}
