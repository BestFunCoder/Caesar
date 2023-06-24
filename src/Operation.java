import java.util.Scanner;

public class Operation {
    private static final String OFFER_OF_CHOICE = """
            Виберіть необхідну оперецію.
            Введіть цифру відповідної операції та натисніть Enter:""";
    private static final String MENU_CHOICE = """
            1 - Шифрування.
            2 - Розшифровування.
            3 - Вихід в головне меню.
            4 - Вихід з програми.""";
    private static final String CHOICE_OF_ENCRYPTION = "\nВи обрали операцію - Шифрування.\n";
    private static final String CHOICE_OF_DECODING = "\nВи обрали операцію - Розшифровування.\n";
    private static final String CHOICE_MAIN_MENU = "\nВи обрали вихід в головне меню.\n";
    private static final String ERROR_CHOICE = "\nВи зробили помилковий вибір, спробуйте ще раз.\n";
    private static final String CHOICE_EXIT = "\nВи обрали вихід з програми. Допобачення!";
    private static int select;

    public int operationSelection() {
        System.out.println(OFFER_OF_CHOICE);
        System.out.println(MENU_CHOICE);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        }
         switch (select){
            case 1 -> System.out.println(CHOICE_OF_ENCRYPTION);
            case 2 -> System.out.println(CHOICE_OF_DECODING);
            case 3 -> {
                System.out.println(CHOICE_MAIN_MENU);
                Menu.starting();
            }
            case 4 -> {
                System.out.println(CHOICE_EXIT);
                System.exit(0);
            }
            default -> {System.out.println(ERROR_CHOICE);
                operationSelection();
            }
         }
        return select;
    }
}