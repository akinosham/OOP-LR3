import java.io.*;
import java.util.*;
public class laba3 {
    public static void main(String[] args) {
        String input_file = "sample1.txt";
        String output_file = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(input_file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output_file))) {

            HashMap<Integer, String> lines = new HashMap<>();
            int k = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines.put(k++, line);
            }

            for (int i = k - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }

            System.out.println("Строки успешно записаны в файл " + output_file + " в обратном порядке.");

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл " + input_file + " не найден.");
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
