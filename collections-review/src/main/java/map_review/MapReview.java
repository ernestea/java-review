package map_review;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergio");
        map.put(2, "Moses");
        map.put(3, "Anton");
        map.put(4, "Bob");

        System.out.println(map.get(2));

        //Task: return the first repeating character in a string using hashmap
        System.out.println(getFirstRepeatingCharacter("Java Developer"));
        //Task2: return the first not repeating character in a string using hashmap
        System.out.println(getFirstNonRepeatingCharacter("are You a Java Developer?"));


    }

    public static Character getFirstRepeatingCharacter(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
                return c;
            } else {
                map.put(c, 1);
            }
        }
        return null;
    }
    public static Character getFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : input.toCharArray()) {
            if(map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            }else{
                map.put(c, 1);
            }


        }

        for (Character c : input.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return Character.MIN_VALUE;
    }
}
