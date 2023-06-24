import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFile {

    private static final String SELECTION_ERROR = "\nВи ввели недійсний шлях до файлу.\n" +
            "1 - Ввести адресу ще раз.\n" +
            "2 - Вийти в головне меню.\n";
    private static final String PROMPT_TO_SELECT_FILE = "Даний файл наявний та має правильне розширення.";
    private static final String ENTER_TO_FILE_PATCH = "Введіть шлях до файлу (розширення .txt):";

    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Character> readFileToChar() {
        Path path = null;
        ArrayList<Character> arrayCharSourceFile = new ArrayList<>();

        System.out.println(ENTER_TO_FILE_PATCH);
        if(scanner.hasNextLine()){
        path = Path.of(scanner.nextLine());
        }

        if (Files.exists(path) && path.toString().endsWith(".txt")) {
            System.out.println(PROMPT_TO_SELECT_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    char[] chars = line.toCharArray();
                    for (char c : chars) {
                        arrayCharSourceFile.add(c);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println(SELECTION_ERROR);
            if (scanner.hasNextInt()){
                if(scanner.nextInt() == 1){
                    readFileToChar();
                } else if (scanner.nextInt() == 2) {
                    new Menu().starting();
                }
            }
        }
         return arrayCharSourceFile;
    }
}
