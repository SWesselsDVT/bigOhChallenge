import java.util.ArrayList;

public class Main {

    private static final int UNLIKELY_ALPHABET_LENGTH = 2000;
    private static final int VERY_LARGE_ARRAY = 5000;

    public static void alphabetLoopNSquared(ArrayList<Integer> A, String[] alphabets){
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < alphabets.length; j++)
                System.out.print(alphabets[j]);
            System.out.println();
        }
    }

    public static void alphabetLoopN(ArrayList<Integer> A, String[] alphabets){
        String alphabet = "";
        for(int j = 0; j < alphabets.length; j++)
            alphabet += alphabets[j];
        for(int i = 0; i < A.size(); i++)
            System.out.println(alphabet);
    }

    public static void main(String[] args) {
        String[] alphabets = new String[UNLIKELY_ALPHABET_LENGTH];
        for(int i = 0; i < UNLIKELY_ALPHABET_LENGTH; i++)
            alphabets[i] = "a";
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i < VERY_LARGE_ARRAY; i++)
            A.add(i);
        alphabetLoopNSquared(A, alphabets);
        long endTime = System.currentTimeMillis();
        double total = (endTime - startTime)/1000.0;
        System.out.println(total + "s");
    }
}
