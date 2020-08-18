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
        boolean noBound = false;
        for (int i = 0; i < array.length; i++) {
            if (target > array[array.length - 1]) {
                System.out.println(-1);
                noBound = false;
                break;
            }
            if (target < array[array.length - 1] && target > array[array.length - 2]) {
                System.out.println((array.length - 1) + " " + (array.length - 1));
                noBound = false;
                break;
            }
            if (array[index] <= target && array[index + jump - 1] >= target) {
                System.out.println(index + " " + (index + jump - 1));
                noBound = false;
                break;
            } else {
                index = index + jump;
                noBound = true;
            }
            if (index> array.length ){
                break;
            }
        }
        if (noBound) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > target) {
                    if (array[i - 1] < target) {
                        System.out.println(i - 1 + " " + i);
                    }
                }
            }
        }
    }
}