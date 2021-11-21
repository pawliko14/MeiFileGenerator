package Beams;

import Notes.Note;
import Notes.NotePackageGenerator;
import RandomizingParameters.Parameters;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BeamsRandomizer {

    private final int MAX_RANDOM = 10;
    private final int MIN_RANDOM = 10;

    public StringBuilder getRandomizedString() {
        NotePackageGenerator notePackageGenerator = new NotePackageGenerator(Parameters.TEMPO);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Parameters.MAX_MEASURES; i++) {
            List<Note> notePackage = notePackageGenerator.createNotePackage();

            //  String notesStringWithRandomizedBeams = notePackage.stream().map(s -> s.generateNoteStringFromNote()).collect(Collectors.joining());

            String s = randomizeBeams(notePackage);

            String measureWithInnerData = "                       <measure xml:id=\"1\" right=\"dbl\" n=\"" + i + 1 + "\">\n" +
                    "                             <staff xml:id=\"1\" n=\"1\">\n" +
                    "                                    <layer xml:id=\"1\" n=\"1\">\n" +
                    "                                        " + s + "                            " +
                    "                                    </layer>\n" +
                    "                               </staff>\n" +
                    "                           </measure>";
            measureWithInnerData = "\n" + measureWithInnerData + "\n";
            sb.append(measureWithInnerData);
        }

        return sb;
    }

    private String randomizeBeams(List<Note> notePackage) {
        int notesCount = notePackage.size();

        if (notesCount == 1) {
            return notePackage.stream().map(s -> s.generateNoteStringFromNote()).collect(Collectors.joining());
        }

        if (notePackage.stream().allMatch(s -> s.getDur() == 8) ||notePackage.stream().allMatch(s -> s.getDur() == 16)) {

            Random rand = new Random();
            int randomNum = rand.nextInt((MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM) + 1;

            // 40% chance to create beams
            if (randomNum <= 9) {
                return "                                    <beam>\n" +
                        notePackage.stream().map(s -> s.generateNoteStringFromNote()).collect(Collectors.joining()) +
                        "                                    </beam>";
            }
        }
        return notePackage.stream().map(s -> s.generateNoteStringFromNote()).collect(Collectors.joining());
    }


}
