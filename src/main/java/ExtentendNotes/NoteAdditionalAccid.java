package ExtentendNotes;

import Notes.Note;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteAdditionalAccid extends Note {

    private char accid;

    public NoteAdditionalAccid(int id, int dur, int oct, char pname, char accid) {
        super(id, dur, oct, pname);
        this.accid = accid;
    }

    public String generateNoteStringFromNote(){
        return "<note xml:id=\"" + this.getId() +
                "\" dur=\"" + this.getDur() +
                "\" oct=\"" + this.getOct() +
                "\" pname=\"" + this.getPname() +
                "\" accid=\"" + this.getAccid() +
                "\" stem.dir=\"up\"/>\n";
    }

}
