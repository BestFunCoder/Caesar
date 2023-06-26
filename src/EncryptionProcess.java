import java.util.ArrayList;
public class EncryptionProcess {
    ArrayList<Character> outputCharArr = new ArrayList<>();
    ArrayList<Character> arrayCharFile = new ArrayList<>();
    int yourShiftKey;
    int newShiftKey;
    ArrayList<Character> alphabetUkrainian = SampleUkrainianAlphabet.alphabetUa;
    KeySelection keySelection = new KeySelection();

    private void withKey1() {
        outputCharArr.add('Г');
        outputCharArr.add('Ґ');
        outputCharArr.add('Д');
    }

    private void withKey2() {
        outputCharArr.add('Д');
        outputCharArr.add('Е');
        outputCharArr.add('Є');
    }

    private void withKey3() {
        outputCharArr.add('Є');
        outputCharArr.add('Ж');
        outputCharArr.add('З');
    }

    public EncryptionProcess(ArrayList<Character> arrayCharFile, int yourShiftKey) {
        this.arrayCharFile = arrayCharFile;
        this.yourShiftKey = yourShiftKey;
    }

    public void encrupt1() {
        if (yourShiftKey == keySelection.yourShiftKey1) {
            withKey1();
        } else if (yourShiftKey == keySelection.yourShiftKey2) {
            withKey2();
        } else if (yourShiftKey == keySelection.yourShiftKey3) {
            withKey3();
        }

        encrupt2();
    }

    public void encrupt2() {
        for (int i = 0; i < arrayCharFile.size(); i++) {
            //отримуємо чар з масиву-джерела
            Character ch = arrayCharFile.get(i);
            //System.out.println(ch);
            //перевірка чи чар є UpperCase
            if (Character.isUpperCase(ch)) {
                // чи є чар в українському алфавіті
                if (alphabetUkrainian.contains(ch)) {
                    int ret = alphabetUkrainian.indexOf(ch);
                    newShiftKey = ret + yourShiftKey;
                    //зациклення для алфавіту
                    if (newShiftKey > 40) {
                        newShiftKey = newShiftKey%41;
                    }
                    Character ghhgjg = alphabetUkrainian.get(newShiftKey);
                    outputCharArr.add(ghhgjg);
                    // якщо чар LowerCase
                }
            }else if (Character.isLowerCase(ch)) {
                    // Переводимо чар в юперКейс і перевіряємо чи є в українській мові
                Character ch1 = Character.toUpperCase(ch);
                    if (alphabetUkrainian.contains(ch1)) {
                        int ret = alphabetUkrainian.indexOf(ch1);
                        newShiftKey = ret + yourShiftKey;
                        //зациклення для алфавіту
                        if (newShiftKey > 40) {
                            newShiftKey = newShiftKey % 41;
                        }
                        Character ghhgjg = alphabetUkrainian.get(newShiftKey);
                        outputCharArr.add(Character.toLowerCase(ghhgjg));
                    }
            }
        }
        for (Character character : outputCharArr) {
            System.out.print(character);
        }
    }
}