package Notes.Enums;

import java.util.Random;

public enum NoteOctEnum {
    DEFAULT(4),
    HIGHER(5),
    LOWE(3);

    private int noteOct;

    NoteOctEnum(int noteOct) {
        this.noteOct = noteOct;
    }

    public int getNoteOct() {
        return noteOct;
    }

    public static NoteOctEnum generateRandomNoteOct() {
        NoteOctEnum[] values = NoteOctEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
