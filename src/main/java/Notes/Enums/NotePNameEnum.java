package Notes.Enums;

import java.util.Random;

public enum NotePNameEnum {
    C('c'),
    D('d'),
    E('e'),
    F('f'),
    G('g'),
    A('a'),
    B('c');

    private char notePName;

    NotePNameEnum(char notePName) {
        this.notePName = notePName;
    }

    public char getNotePName() {
        return notePName;
    }

    public static NotePNameEnum generateRandomNotePName() {
        NotePNameEnum[] values = NotePNameEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
