package org.example.countCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public int countChars(String[] words, String chars) {

        Map<Character, Integer> charsMap = new HashMap<>();
        //build the map with chars and frequencies
        for (Character c : chars.toCharArray()){
            charsMap.put(c, charsMap.getOrDefault(c, 0)+ 1);
            // charsMap (a=2,t=1,c=1,h=1)
        }
        int result = 0;

        // loop through the words
        for (String s : words){
            // create a copy of orignal charsMap
            Map <Character, Integer> copyCharsMap = new HashMap<>(charsMap);
            boolean valid = true;
            //loop through each char in the word at s
            for (Character c : s.toCharArray()){
                if (copyCharsMap.getOrDefault(c,0) == 0){
                    valid = false;
                    break;
                } else {
                    // decrement the frequency
                    copyCharsMap.put(c,copyCharsMap.get(c)-1);
                }
            }
            if (valid){
                result = result + s.length();
            }

        }
        System.out.println(result);
        return result;
    }



    public int countCharacters(String[] words, String chars) {
        // count chars
        int [] charCount = new int [26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int result = 0;
        for (String s : words) {
            int [] copyCounts = charCount.clone();
            boolean valid = true;
            for (char c : s.toCharArray()) {
                if (copyCounts[c-'a'] == 0) {
                    valid = false;
                    break;
                }
                copyCounts[c - 'a']--;
            }

            if (valid) {
                result += s.length();
            }
        }
        return result;

    };
}
