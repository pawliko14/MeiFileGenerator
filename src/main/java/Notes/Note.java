package Notes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Note {

    private int id;

    private int dur;
    private int oct;
    private char pname;

    public String generateNoteStringFromNote(){
        return "<note xml:id=\"" + this.getId() +
                "\" dur=\"" + this.getDur() +
                "\" oct=\"" + this.getOct() +
                "\" pname=\"" + this.getPname() +
                "\" stem.dir=\"up\"/>\n";
    }

}
