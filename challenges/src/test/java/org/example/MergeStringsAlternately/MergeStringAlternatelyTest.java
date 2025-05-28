package org.example.MergeStringsAlternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringAlternatelyTest {

    @Test
    void mergeStringAlternatelyExample1() {
        String word1 = "abc";
        String word2 = "pqr";

        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        assertEquals("apbqcr", mergeStringAlternately.mergeStringAlternately(word1,word2));
    }

    @Test
    void mergeStringAlternatelyExample2() {
        String word1 = "ab";
        String word2 = "pqrs";

        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        assertEquals("apbqrs", mergeStringAlternately.mergeStringAlternately(word1,word2));
    }

    @Test
    void mergeStringAlternatelyExample3() {
        String word1 = "abcd";
        String word2 = "pq";

        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        assertEquals("apbqcd", mergeStringAlternately.mergeStringAlternately(word1,word2));
    }

    @Test
    void mergeStringAlternatelyExample4() {
        String word1 = "";
        String word2 = "pq";

        MergeStringAlternately mergeStringAlternately = new MergeStringAlternately();
        assertEquals("pq", mergeStringAlternately.mergeStringAlternately(word1,word2));
    }
}