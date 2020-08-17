import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }

        int target = scanner.nextInt();

        int jump = (int) Math.sqrt(sizeOfArray);

        // System.out.println(Arrays.toString(array));

        int index = 0;

        //System.out.println(index + jump);

       /* for (int i = 0; i < array.length; i++) {
            if (target > array[array.length - 1]) {
                System.out.println(-1);
                break;
            }
            if (target < array[array.length - 1] && target > array[array.length - 2]) {
                System.out.println((array.length - 1) + " " + (array.length - 1));
                break;
            }
            if (array[index] <= target && array[index + jump - 1] >= target) {
                System.out.println(index + " " + (index + jump - 1));
                break;
            } else {
                index = index + jump;
            }

        */
    }

    public static int jumpSearch(int[] array, int target) {
        int currentRight = 0; // right border of the current block
        int prevRight = 0; // right border of the previous block

        /* If array is empty, the element is not found */
        if (array.length == 0) {
            return -1;
        }

        /* Check the first element */
        if (array[currentRight] == target) {
            return 0;
        }

        /* Calculating the jump length over array elements */
        int jumpLength = (int) Math.sqrt(array.length);

        /* Finding a block where the element may be present */
        while (currentRight < array.length - 1) {

            /* Calculating the right border of the following block */
            currentRight = Math.min(array.length - 1, currentRight + jumpLength);

            if (array[currentRight] >= target) {
                break; // Found a block that may contain the target element
            }

            prevRight = currentRight; // update the previous right block border
        }

        /* If the last block is reached and it cannot contain the target value => not found */
        if ((currentRight == array.length - 1) && target > array[currentRight]) {
            return -1;
        }

        /* Doing linear search in the found block */
        return backwardSearch(array, target, prevRight, currentRight);
    }

    public static int backwardSearch(int[] array, int target, int leftExcl, int rightIncl) {
        for (int i = rightIncl; i > leftExcl; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}