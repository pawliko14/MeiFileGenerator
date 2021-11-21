import Beams.BeamsRandomizer;
import Notes.Note;
import Notes.NoteGenerator;
import Notes.NotePackageGenerator;
import Notes.NoteRandomizer;
import RandomizingParameters.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        packageGeneratorTest();
    }



    private static void packageGeneratorTest() {

        NotePackageGenerator notePackageGenerator = new NotePackageGenerator(Parameters.TEMPO);

        BeamsRandomizer beamsRandomizer = new BeamsRandomizer();
        StringBuilder randomizedString = beamsRandomizer.getRandomizedString();

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < Parameters.MAX_MEASURES; i++) {
//            List<Note> notePackage = notePackageGenerator.createNotePackage();
//
//            String notesString = notePackage.stream().map(s -> s.generateNoteStringFromNote()).collect(Collectors.joining());
//
//            String measureWithInnerData = "                       <measure xml:id=\"1\" right=\"dbl\" n=\"" + i + 1 + "\">\n" +
//                    "                             <staff xml:id=\"1\" n=\"1\">\n" +
//                    "                                    <layer xml:id=\"1\" n=\"1\">\n" +
//                    "                                        " + notesString + "                            " +
//                    "                                    </layer>\n" +
//                    "                               </staff>\n" +
//                    "                           </measure>";
//            measureWithInnerData = "\n" + measureWithInnerData + "\n";
//            sb.append(measureWithInnerData);
//        }

        StringBuilder sb2 = new StringBuilder();

        sb2.append(BaseXML.baseXMLFirstPart);
        sb2.append(randomizedString);
        sb2.append(BaseXML.BaseXMlSecondPart);

        System.out.println(sb2);


    }


}
