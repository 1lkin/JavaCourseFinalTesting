/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

package Task3Duplicates;

import java.util.Arrays;

/**
 * IKIN HASANOV's response to Homework "Duplicates".
 *
 *   Task:
 *      Check the existence of duplicates in an array
 *
 * @version 1.10
 * @Since 19-04-2021
 * @class
 * @author Ilkin Hasanov
 */
public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        boolean answer = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}
