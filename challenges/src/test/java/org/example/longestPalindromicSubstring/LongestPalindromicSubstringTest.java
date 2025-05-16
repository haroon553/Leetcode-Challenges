package org.example.longestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindromeBruteForce() {
        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        String s = "babad";
        assertEquals("bab", palindromicSubstring.longestPalindromeBruteForce(s));
    }

    @Test
    void longestPalindromeExample1() {
        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        String s = "babad";
        assertEquals("aba", palindromicSubstring.longestPalindrome(s));
    }

    @Test
    void longestPalindromeExample2() {
        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        String s = "cbbd";
        assertEquals("bb", palindromicSubstring.longestPalindrome(s));
    }
}