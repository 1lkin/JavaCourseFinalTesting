/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

package Task2RightShift;

import java.util.Arrays;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since 19-04-2021
 * @class
 * @author Ilkin Hasanov
 */
public class RightShift {
    public static int[] rightShift(int[] array, int step){
        int[] shiftedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            shiftedArray[(i+step)%array.length] = array[i];
        }
        return shiftedArray;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}
