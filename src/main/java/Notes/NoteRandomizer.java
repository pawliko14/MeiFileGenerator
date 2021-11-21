package Notes;

import ExtentendNotes.Enums.AccidEnum;
import ExtentendNotes.NoteAdditionalAccid;
import Notes.Enums.NoteDurEnum;
import Notes.Enums.NoteOctEnum;
import Notes.Enums.NotePNameEnum;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public class NoteRandomizer {

    private final static int MAX_RANDOM = 10;
    private final static int MIN_RANDOM = 10;
    private final static int MAX_RANDOM_ID = 1000;
    Random rand = new Random();
    private Note note;

    public Note getRandomizedNote() {

        int randomNum = rand.nextInt((MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM) + 1;


        NoteDurEnum noteDurEnum = NoteDurEnum.generateRandomNoteDur();
        NoteOctEnum noteOctEnum = NoteOctEnum.generateRandomNoteOct();
        NotePNameEnum notePNameEnum = NotePNameEnum.generateRandomNotePName();

        if (randomNum == MIN_RANDOM) {
            AccidEnum accidEnum = AccidEnum.generateRandomAccid();
            this.note = new NoteAdditionalAccid(this.getRandomizedId(), noteDurEnum.getNoteVal(), noteOctEnum.getNoteOct(), notePNameEnum.getNotePName(), accidEnum.getAccidChar());
        } else {
            this.note = new Note(this.getRandomizedId(), noteDurEnum.getNoteVal(), noteOctEnum.getNoteOct(), notePNameEnum.getNotePName());
        }
        return this.note;
    }

    public Note getNote() {
        return this.note;
    }

    private int getRandomizedId() {
        return new Random().nextInt(MAX_RANDOM_ID);
    }

}
