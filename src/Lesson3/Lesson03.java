package Lesson3;

public class Lesson03 {
    public static void main(String[] args) {
//        double x = 190;
//        double y = F2C(x);
//        System.out.println("y = " + y);
//        System.out.println(RoomTemp(y));

//        boolean result = divisibleBy(20, 3);
//        result = divisibleBy(20, 3);
//        result = divisibleBy(20, 3);
        //System.out.println(result);
        System.out.println(add(2, 4));
        System.out.println(add(2, 4, 4));

        // Create a function takes 3 double and returns the largest one. Print the value that is returned by your function.
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static float add(float x, float y) {
        return x + y;
    }

    static double F2C(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        return tempC;
    }

    static boolean divisibleBy(int x, int y) {
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        if (x % y == 0) {
            System.out.println(x + " is divisible by " + y);
            return true;
        } else {
            System.out.println(x + " is not divisible by " + y);
            return false;
        }
    }

    static boolean RoomTemp(double C) {
        if (C < 20){
            System.out.println("The room is too cold");
            return false;
        }
        else if (C >= 20 && C <= 23){
            System.out.println("The room is just perfect");
            return true;
        }
        else {
            System.out.println("The room is too hot");
            return false;
        }
    }
}
