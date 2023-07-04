package Lesson2;

public class Lesson02 {
    public static void main(String[] args) {

        double temp_f = 78.0;
        double temp_c = (temp_f - 32.0) * 5.0 / 9.0;
        System.out.println("The temperature is " + temp_c + "°C");
        // is equal to x == y
        // is not equal to x != y
        // is less than x < y
        // is greater than x > y
        // is less than or equal to x <= y
        // is greater than or equal to x >= y

        // and &&, or ||, not !


        if (temp_c <= 0) {
            System.out.println("Water freezes at this temperature");
        }
        if (temp_c >= 100) {
            System.out.println("Water boils at this temperature");
        }
        if (temp_c > 0 && temp_c < 100) {
            System.out.println("Water is in liquid form!");
        }


        if (temp_c >= 100) {
            System.out.println("Water boils at this temperature");
        } else if (temp_c > 0) {
            System.out.println("Water is in liquid form!");
        } else {
            System.out.println("Water freezes at this temperature");
        }

        System.out.println("This line always run");

        // takes an integer x print whether x is a div by 3 or not
    }
}
