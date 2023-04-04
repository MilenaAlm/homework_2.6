import java.util.*;



public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    private static void task1(){
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for(Integer number : nums) {
            if (number % 2 == 1) {
                System.out.println(number + " ");
            }
        }
        System.out.println("________________________");
        }
    private static void task2(){
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for(Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number + " ");
            }
        }
        System.out.println("________________________");
    }
    private static void task3(){
        System.out.println("Задача 3");
        List<String> words = new ArrayList<>(List.of("TEST", "test","tesT","TEst", "tEst","test"));
        for(String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.println(word + " ");
            }
        }
        System.out.println("________________________");
    }
    private static void task4(){
        System.out.println("Задача 4");
        List<String> words = new ArrayList<>(List.of("TEST", "test","tesT","TEst", "TEst","test"));
        Map<String, Integer> map = new TreeMap<>();
        for(String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else
                map.replace(word, map.get(word) + 1);
        }
        int wordsWithDuplicates = 0;
        for (Integer count : map.values()) {
            if (count > 1) {
                wordsWithDuplicates++;
            }
        }
        System.out.println("Количество слов с повторами: " + wordsWithDuplicates);
        System.out.println("________________________");
    }
    }
