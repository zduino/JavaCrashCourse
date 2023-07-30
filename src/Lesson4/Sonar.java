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

    /**
     * Scans a point in the region based on a specified coordinate.
     * @param x The x component of the coordinate
     * @param y The y component of the coordinate
     * @return If there was a response at the specified coordinate
     */
    public static boolean ping(int x, int y) {
        return (x >= _X && x <= _X + (_IsHorizontal ? _Size : 0) &&
                y >= _Y && y <= _Y + (_IsHorizontal ? 0 : _Size));
    }

    /**
     * Gets the size of the window where the sonar works. Note the origin of the region is (0, 0).
     * @return An array of 2 integers representing width and height respectively
     */
    public static int[] size() {
        return new int[]{Width, Height};
    }
}
