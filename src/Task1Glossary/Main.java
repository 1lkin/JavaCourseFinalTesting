package Task1Glossary; /**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * IKIN HASANOV's response to Homework "Final course task".
 *
 *   Task:
 *    1. Download a text about Harry Potter.
 *    2. For each distinct word in the text calculate the number of occurrence.
 *    3. Use RegEx..
 *    4. Sort in the DESC mode by the number of occurrence..
 *    5. Find  the first 20 pairs.
 *    6  Find all the proper names
 *    7. Count them and arrange in alphabetic order.
 *    8. First 20 pairs and names write into to a file test.txt
 *    9. Create a fine header for the file
 *    10 Use Java  Collections to demonstrate your experience (Map, List )
 *
 *
 * @version 1.10
 * @Since 19-04-2021  20:34
 * @class
 * @author Ilkin Hasanov
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String text = new String
                (Files.readAllBytes(Paths.get("src/Task1Glossary/harry.txt")));

        text = text.toLowerCase().replaceAll("[^A-Za-z ]","");
        String[] array = text.split(" +");
        List<String> list = Arrays.stream(array).collect(Collectors.toList());

        Map<String, Integer> map = new HashMap<>();
        Integer value = 0;
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            }else {
                value = map.get(array[i]);
                map.put(array[i], value + 1 );
            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();


        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

        sorted.entrySet().stream().forEach(System.out::println);

    }
}
