package Notes;


public class NoteGenerator {

    private final NoteRandomizer noteRandomizer;

    public NoteGenerator(NoteRandomizer noteRandomizer) {
        this.noteRandomizer = noteRandomizer;
    }

    public String generateNoteStringFromRandom() {
        return "<note xml:id=\"" + noteRandomizer.getRandomizedNote().getId() +
                "\" dur=\"" + noteRandomizer.getRandomizedNote().getDur() +
                "\" oct=\"" + noteRandomizer.getRandomizedNote().getOct() +
                "\" pname=\"" + noteRandomizer.getRandomizedNote().getPname() +
                "\" stem.dir=\"up\"/>\n";
    }

    public NoteRandomizer getNoteRandomizer() {
        return noteRandomizer;
    }
}
