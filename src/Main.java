import java.util.ArrayList;

import static app.AlphabetPrinter.nestedLoopAlphabetPrinter;
import static app.AlphabetPrinter.sequentialLoopAlphabetPrinter;

public class Main {

    private static final int VERY_LARGE_ARRAY = 100000;
    private static final int UNLIKELY_ALPHABET_LENGTH = 20;

    public static void main(String[] args) {
        String[] alphabets = createAlphabets();
        ArrayList<Integer> A = createContainer();

        long nestedLoopStartTime = System.currentTimeMillis();
        nestedLoopAlphabetPrinter(A, alphabets);
        long nestedLoopEndTime = System.currentTimeMillis();

        long sequentialLoopStartTime = System.currentTimeMillis();
        sequentialLoopAlphabetPrinter(A, alphabets);
        long sequentialLoopEndTime = System.currentTimeMillis();

        getBenchmarkResults("Nested Loop", nestedLoopStartTime, nestedLoopEndTime);
        getBenchmarkResults("Sequential Loop", sequentialLoopStartTime, sequentialLoopEndTime);
    }

    private static void getBenchmarkResults(String description, long startTime, long endTime) {
        double total = (endTime - startTime)/1000.0;
        System.out.println(description + ": " + total + "s");
    }

    private static ArrayList<Integer> createContainer() {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i < VERY_LARGE_ARRAY; i++)
            A.add(i);
        return A;
    }

    private static String[] createAlphabets() {
        String[] alphabets = new String[UNLIKELY_ALPHABET_LENGTH];
        for(int i = 0; i < UNLIKELY_ALPHABET_LENGTH; i++)
            alphabets[i] = "a";
        return alphabets;
    }
}
