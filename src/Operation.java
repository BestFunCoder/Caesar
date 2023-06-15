import java.util.Scanner;

public class Operation {
    static int select;

    public static int operationSelection() {
        System.out.println("Виберіть необхідну оперецію.\nВведіть цифру відповідної операції та натисніть Enter:");
        System.out.println("1 - Шифрування\n2 - Розшифровування");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        }
        if (select == 1) {
            System.out.println("Ви обрали операцію - Шифрування.");
        } else if (select == 2) {
            System.out.println("Ви обрали операцію - Розшифровування.");
        } else {
            System.out.println("Ви зробили помилковий вибір, спробуйте ще раз.");
            operationSelection();
        }
        return select;
    }
}