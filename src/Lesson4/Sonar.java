package Lesson4;

import java.util.Random;

public class Sonar {
    private static final Random _Random = new Random();
    private static final boolean _IsHorizontal = _Random.nextBoolean();
    private static final int _Size = 3;
    private static final int Width = 100;
    private static final int Height = 100;
    private static final int _X = _Random.nextInt(Width - (_IsHorizontal ? _Size : 0));
    private static final int _Y = _Random.nextInt(Height - (_IsHorizontal ? 0 : _Size));

    public static boolean ping(int x, int y) {
        return (x >= _X && x <= _X + (_IsHorizontal ? _Size : 0) &&
                y >= _Y && y <= _Y + (_IsHorizontal ? 0 : _Size));
    }

    public static int[] size() {
        return new int[]{Width, Height};
    }

//    public static void debug() {
//        for (int y = 0; y <= Height; y++) {
//            for (int x = 0; x <= Width; x++) {
//                System.out.print((ping(x, y) ? 'X' : '.'));
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        debug();
//    }
}
