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



//        for (int i = 0; i < beetles.length; i++) {
//            int count = 0;
//            for (int j = 0; j < beetles.length; j++) {
//                if (beetles[i].equals(beetles[j])) {
//                    count++;
//                }
//            }
//            System.out.println(beetles[i] + " - " + count);
//        }


        for (int i = 0; i < beetles.length; i++) {
            String word = beetles[i];
            if (beetles2.containsKey(word)) {
                int count = beetles2.get(word);
                beetles2.put(word, count + 1);
            } else {
                beetles2.put(word, 1);
            }
        }

        for (String word : beetles2.keySet()) {
            int count = beetles2.get(word);
            System.out.println(word + " " + count);

        }
    }
}
