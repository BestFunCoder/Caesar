import java.util.Scanner;

public class EncryptionMethod {
    static int encrypMeth;

    public static int selectEncryptionMethod() {
        System.out.println("Оберіть метод шифрування/розшифрування увівши відповідну цифру:");
        System.out.println("1 - метод Brute Forсe\n2 - метод статичної аналітики");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            encrypMeth = scanner.nextInt();
        }
        if (encrypMeth == 1) {
            System.out.println("Ви обрали метод Brute Forсe.");
        } else if (encrypMeth == 2) {
            System.out.println("Ви обрали метод статичної аналітики.");
        } else {
            System.out.println("Ви зробили помилковий вибір, спробуйте ще раз");
            selectEncryptionMethod();
        }
        return encrypMeth;
    }
}