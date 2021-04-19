/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package Task4CommonPrefix;
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
public class Prefix {

    public static String prefix(String[] array) {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc
    }
}

