package Notes.Enums;

import java.util.Random;

public enum NoteDurEnum {
    FULL_NOTE(1),
    HALF_NOTE(2),
    QUARTER_NOTE(4),
    EIGHT_NOTE(8),
    SIXTNTH_NOTE(16);

    private int noteVal;

    NoteDurEnum(int noteVal) {
        this.noteVal = noteVal;
    }

    public int getNoteVal() {
        return this.noteVal;
    }

    public static NoteDurEnum generateRandomNoteDur() {
        NoteDurEnum[] values = NoteDurEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
