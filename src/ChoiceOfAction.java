import java.util.Scanner;

public abstract class ChoiceOfAction {
    public  final int MENU_ITEM_POSITION_1 = 1;
    public final int MENU_ITEM_POSITION_2 = 2;
    public final int MENU_ITEM_POSITION_3 = 3;
    public final int MENU_ITEM_POSITION_4 = 4;
    private static final String OFFER_OF_CHOICE = """
            Виберіть необхідну дію.
            Введіть цифру відповідної дії та натисніть Enter:""";
    private static final String ERROR_CHOICE = "\nВи зробили помилковий вибір, спробуйте ще раз.\n";
    private static int select;
    public abstract String getMENU_ITEMS();
    public abstract void getSELECTION_POSITION_1();
    public abstract void getSELECTION_POSITION_2();
    public abstract void getSELECTION_POSITION_3();
    public abstract void getSELECTION_POSITION_4();
    public int operationSelection() {
        System.out.println(OFFER_OF_CHOICE);
        System.out.println(getMENU_ITEMS());
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        }
        switch (select) {
            case MENU_ITEM_POSITION_1 -> getSELECTION_POSITION_1();
            case MENU_ITEM_POSITION_2 -> getSELECTION_POSITION_2();
            case MENU_ITEM_POSITION_3 -> getSELECTION_POSITION_3();
            case MENU_ITEM_POSITION_4 -> getSELECTION_POSITION_4();
            default -> {
                System.out.println(ERROR_CHOICE);
                operationSelection();
            }
        }
        return select;
    }
}















