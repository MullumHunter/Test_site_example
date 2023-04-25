package Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] beetles = {"Скарабей", "Плавунец", "Майский жук", "Божья коровка", "Жук-Олень", "Майский жук", "Жук-Геркулес", "Жук-Олень", "Жук-Носорог", "Майский жук", "Плавунец", "Майский жук", "Божья коровка", "Жук-Олень", "Майский жук", "Жук-Геркулес", "Божья коровка", "Майский жук"};
        Set<String> incomparable = new HashSet<>(Arrays.asList(beetles));
        HashMap<String, Integer> beetles2 = new HashMap<>();

        System.out.println(incomparable.size());
        System.out.println(beetles.length);
        System.out.println(incomparable);

        checkCountWordsWithMap(beetles, beetles2);
        printMap(beetles2);
        checkCountWords(beetles);
    }

    private static void checkCountWordsWithMap(String[] beetles, HashMap<String, Integer> beetles2) {
        for (int i = 0; i < beetles.length; i++) {
            String word = beetles[i];
            if (beetles2.containsKey(word)) {
                int count = beetles2.get(word);
                beetles2.put(word, count + 1);
            } else {
                beetles2.put(word, 1);
            }
        }
    }

    private static void printMap(HashMap<String, Integer> beetlesMap) {
        Set<String> keySet = beetlesMap.keySet();
        for (String word : keySet) {
            int count = beetlesMap.get(word);
            System.out.println(word + " " + count);
        }

        Set<Map.Entry<String, Integer>> entries = beetlesMap.entrySet();
        for (Map.Entry<String, Integer> pair : entries) {
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }
    }

    private static void checkCountWords(String[] beetles) {
        for (int i = 0; i < beetles.length; i++) {
            int count = 0;
            for (int j = 0; j < beetles.length; j++) {
                if (beetles[i].equals(beetles[j])) {
                    count++;
                }
            }
            System.out.println(beetles[i] + " - " + count);
        }
    }
}
