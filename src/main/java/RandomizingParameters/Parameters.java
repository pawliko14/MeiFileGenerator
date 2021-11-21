package RandomizingParameters;

import java.util.Random;

public class Parameters {
    // tacts quantity
    public static final int MAX_MEASURES = generateRandomMaxMeasures();
    // tempo 2/4 3/4 4/4 -> 2,3,4
    public static final int TEMPO = geerateRandomTempo();


    private static int generateRandomMaxMeasures(){
        Random random = new Random();
        return random.nextInt((500-20) + 10) +1; // here a number will be generated between 3 and 8, 3 is a triangle 8 octogon so you can change 8 but leave 3 alone.
    }

    private static int geerateRandomTempo(){
        Random random = new Random();
        return random.nextInt((4 - 2) + 2) + 1;
    }


}
