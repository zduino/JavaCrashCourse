package Lesson4;

public class Lesson04_2 {
    static public void main(String[] args) {
        // index/addr   0  1  2  3  4  5  6  7  8  9
//        int[] myArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int result = sumOfSquares(myArr);
//        System.out.println("Sum of Squares for myArr is " + result);
//
//        String val = (result % 2 == 0 ? "Even" : "Odd");
//        System.out.println(val);

//        boolean foundIt = Sonar.ping(0, 0);
//        System.out.println(foundIt ? "I found it!" : "Miss!");

        // Method 1: nested for loops
//        for (int y = 0; y < 100; y++) {
//            for (int x = 0; x < 100; x++) {
//                if (Sonar.ping(x, y)) {
//                    System.out.print("X");
//                } else {
//                    System.out.print(".");
//                }
//            }
//            System.out.println();
//        }

        // Method 2: mathy way
        int width = 100;
        int height = 100;
        for (int i = 0; i < width * height; i++) {
            int x = i % width;
            int y = i / width;
            // System.out.println(i + " = ( " + x + ", " + y + ")");

            if (Sonar.ping(x, y)) {
                System.out.print("X");
            } else {
                System.out.print(".");
            }

            if (x == width - 1) {
                System.out.println();
            }
        }
    }

    static public int sumOfSquares(int[] arr) {
        int sum = 0;

//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i] * arr[i];
//        }

        for (int num : arr) {
            sum += num * num;
        }

        return sum;
    }

}
