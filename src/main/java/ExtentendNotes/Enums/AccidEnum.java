package ExtentendNotes.Enums;

import java.util.Random;

public enum AccidEnum {
    UP('s'),
    DOWN('f'),
    NATURAL('n');

    private char accidChar;

    AccidEnum(char accidChar){
        this.accidChar = accidChar;
    }

    public char getAccidChar() {
        return accidChar;
    }

    public static AccidEnum generateRandomAccid() {
        AccidEnum[] values = AccidEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
