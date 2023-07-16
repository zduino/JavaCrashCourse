package Lesson4;

public class Lesson04 {
    // global variable are outside of functions

    public static void main(String[] args) {
        // local variables are inside functions

        //index      0  1   2  3  4    5  6
        int[] arr = {4, 1, -5, 2, 9, 230, 6};

        // Other ways of initializing an array's value (size is fixed)
//        int[] test = new int[7];
//        arr = new int[7];
//        arr = new int[]{0, 0, 0, 0, 0, 0};

        System.out.println("Length of arr is " + arr.length);

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        int maxValue = arr[0];

        int i = 0; // initial our indexer

        while (i < arr.length) { // set the condition to keep indexing

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

            System.out.println("arr[" + i +"] = " + arr[i]);

            i += 1; // increment the index
        }

        System.out.println("max of arr is " + maxValue);

        System.out.println("found max of " + findMax(arr));

        // sum of squares function
    }

    static int findMax(int[] arr) {
        int maxValue = arr[0];
        int i = 0; // initial our indexer
        while (i < arr.length) { // set the condition to keep indexing
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
            i += 1; // increment the index
        }
        return maxValue;
    }
}
