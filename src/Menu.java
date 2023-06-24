import java.util.ArrayList;

public class Menu {
    static ArrayList<Character> arrayCharFile;
    static int choosingEncryptionMethod;
    static int yourShiftKey;
    public static void starting() {
        int operationSelect;
            // Вибір операції - шифрування або розшифрування
         operationSelect = new Operation().operationSelection();


        switch (operationSelect) {
            case 1 -> encryptRun();
            case 2 -> decryptRun();
            case 3 -> starting();
            case 4 -> System.exit(0);
        }
    }
    public static void encryptRun() {
    arrayCharFile = ReadFile.readFileToChar();
    yourShiftKey = new KeySelection().selectKey();
    EncryptionProcess encryptionProcess = new EncryptionProcess(arrayCharFile, yourShiftKey);
    }
    public static void decryptRun(){
        choosingEncryptionMethod = new EncryptionMethod().selectEncryptionMethod();
        arrayCharFile = ReadFile.readFileToChar();
    }
}