import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 11;
        int[] array = new int[n];
        int[] numberOfComparisons = new int[array.length];
        int jump = (int) Math.sqrt(n); //3
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                numberOfComparisons[i] = 1;

                continue;
            }
           // numberOfComparisons[i];
            //task 2
            //check 0 - 2 bounds, if 3 index number is smaller than target jump again 3 - 5 until last bound is bigger than target.
            // if bound is bigger than target jump back 1 index until found right

            //task 1
            // check 0 - 2 bounds, if 3 index number is smaller than target jump again 3 - 5 until last bound is bigger than target.
            //if odd number of elements ex.9 last bound is made of 1 element
            //0 1 1 1 3 5 8 13 21 34
            //if searching 22 jump from 0-2; 1 is smaller, jump 3-5; 5 is smaller, jump 6-8; 21 is smaller, jump 9-9; 34 is bigger BINGO correct answer is 9-9
            //if seraching for 6, jump from 0-2; nothing, jump 3-5; nothing, jump 6-8, 21 is bigger than 6 BINGO correct answer is 6-8
        }
    }
}