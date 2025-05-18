package org.example.validPlindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindromeExample1() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        assertEquals(true,validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeExample2() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "race a car";
        assertEquals(false,validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeExample3() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "";
        assertEquals(true,validPalindrome.isPalindrome(s));
    }
}