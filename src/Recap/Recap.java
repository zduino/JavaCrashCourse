package Recap;

public class Recap {
    public static void main(String[] args) {
//        float tempF = 72;
//
//        float tempC = toCelcius(tempF);
//        System.out.println(tempC);
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i + "°F = " + toCelcius(i) + "°C");
        }

        // 42 lb
        // 5300 ft apogee


        ////////////////////////////////////////
//        600 ft main chute deployment
//        19 ft/sec
//
//        0 - 25 mph wind (increments by 2.5mph)
//        how far the rocket can drift (with main chute)
//
//        1) how long it takes to fall to the ground (vertical travel)
//        2) how far does it drift (horizontal travel) <hint: use time it takes to fall>
//        3) print to screen
    }

    public static float toCelcius(float tempF) {
        return (tempF - 32) * 5 / 9;
    }
}
