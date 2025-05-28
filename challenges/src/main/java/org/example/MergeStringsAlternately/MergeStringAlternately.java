package org.example.MergeStringsAlternately;

public class MergeStringAlternately {
    public String mergeStringAlternately(String word1, String word2){
        // base case handling
        if(word1.isEmpty()) return word2;
        if(word2.isEmpty()) return word1;

        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length() ){
            if(i < word1.length()){
                result.append(word1.charAt(i));
            }
            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
