import java.util.Scanner;

public abstract class ChoiceOfAction {
    public  final int MENU_ITEM_POSITION_1 = 1;
    public final int MENU_ITEM_POSITION_2 = 2;
    public final int MENU_ITEM_POSITION_3 = 3;
    public final int MENU_ITEM_POSITION_4 = 4;
    private static final String OFFER_OF_CHOICE = """
            = Виберіть необхідну дію.
            Введіть цифру та натисніть Enter: =""";
    private static final String ERROR_CHOICE = "\n-Ви зробили помилковий вибір, спробуйте ще раз.-\n";
    private static int select;
    public abstract String getMenuItems();
    public abstract void getSelectionPosition1();
    public abstract void getSelectionPosition2();
    public abstract void getSelectionPosition3();
    public abstract void getSelectionPosition4();
    public int operationSelection() {
        System.out.println(OFFER_OF_CHOICE);
        System.out.println(getMenuItems());
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        }
        switch (select) {
            case MENU_ITEM_POSITION_1 -> getSelectionPosition1();
            case MENU_ITEM_POSITION_2 -> getSelectionPosition2();
            case MENU_ITEM_POSITION_3 -> getSelectionPosition3();
            case MENU_ITEM_POSITION_4 -> getSelectionPosition4();
            default -> {
                System.out.println(ERROR_CHOICE);
                operationSelection();
            }
        }
        return select;
    }
}















