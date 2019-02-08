package app;

import java.util.ArrayList;
public class AlphabetPrinter {


    public static void nestedLoopAlphabetPrinter(ArrayList<Integer> A, String[] alphabets){
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < alphabets.length; j++)
                System.out.print(alphabets[j]);
            System.out.println();
        }
    }

    public static void sequentialLoopAlphabetPrinter(ArrayList<Integer> A, String[] alphabets){
        String alphabet = buildAlphabet(alphabets);
        for(int i = 0; i < A.size(); i++)
            System.out.println(alphabet);
    }

    public static void recursiveLoopAlphabetPrinter(ArrayList<Integer> A, String[] alphabets){

        String alphabet = buildAlphabet(alphabets);
        recurse(A,alphabet,0);
    }

    public static int recurse(ArrayList A, String alphabet, int index){
        if (index == A.size()-1){
            System.out.println(alphabet);
            return index;
        }
        System.out.println(alphabet);
        index++;
        return recurse(A,alphabet,index);
    }



    private static String buildAlphabet(String[] alphabets) {
        String alphabet = "";
        for(int j = 0; j < alphabets.length; j++)
            alphabet += alphabets[j];
        return alphabet;
    }
}
