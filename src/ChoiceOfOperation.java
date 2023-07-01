public class ChoiceOfOperation extends ChoiceOfAction {
    private final String MENU_ITEMS = """
            1 - Шифрування.
            2 - Розшифровування.
            3 - Вихід в головне меню.
            4 - Вихід з програми.""";
    public final String SELECTION_POSITION_1 = "\nВи обрали операцію - Шифрування.\n";
    public final String SELECTION_POSITION_2 = "\nВи обрали операцію - Розшифровування.\n";
    public final String SELECTION_POSITION_3 = "\nВи обрали вихід в головне меню.\n";
    public final String SELECTION_POSITION_4 = "\nВи обрали вихід з програми. Допобачення!";

    public String getMENU_ITEMS() {
        return MENU_ITEMS;
    }

    public void getSELECTION_POSITION_1() {
        System.out.println(SELECTION_POSITION_1);
    }

    public void getSELECTION_POSITION_2() {
        System.out.println(SELECTION_POSITION_2);
    }

    public void getSELECTION_POSITION_3() {
        System.out.println(SELECTION_POSITION_3);
        Menu.starting();
    }

    public void getSELECTION_POSITION_4() {
        System.out.println(SELECTION_POSITION_4);
        System.exit(0);
    }
}
