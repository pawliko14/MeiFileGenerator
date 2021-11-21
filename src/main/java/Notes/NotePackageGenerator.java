package Notes;

import java.util.ArrayList;
import java.util.List;

public class NotePackageGenerator {

    // tempo 2/4 or 3/4 or 4/4 => 2 or 3 or 4
    private int tempo;

    public NotePackageGenerator(int tempo) {
        this.tempo = tempo;
    }

    public List<Note> createNotePackage() {
        int maximumNoteTempo = this.tempo * 4;
        NoteGenerator noteGenerator = new NoteGenerator(new NoteRandomizer());
        List<Note> notesPackage = new ArrayList<>();

        while (maximumNoteTempo != 0) {
            Note ranodmizedNote = noteGenerator.getNoteRandomizer().getRandomizedNote();
            int noteDuration = ranodmizedNote.getDur();
            switch (noteDuration) {
                case 1:
                    noteDuration = 16;
                    break;

                case 2:
                    noteDuration = 8;
                    break;

                case 4:
                    noteDuration = 4;
                    break;

                case 8:
                    noteDuration = 2;
                    break;

                case 16:
                    noteDuration = 1;
                    break;
            }
            int maximumNotePrevious = maximumNoteTempo;
            maximumNoteTempo -= noteDuration;


            if (maximumNoteTempo < 0) {
                maximumNoteTempo = maximumNotePrevious;

            } else if (maximumNoteTempo == 0) {
                notesPackage.add(ranodmizedNote);
            } else {
                notesPackage.add(ranodmizedNote);
            }

        }
        return notesPackage;
    }
}
