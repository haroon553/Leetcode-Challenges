package org.example.longestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindromeBruteForce(String s){
        // handle base cases
        if(s == null || s.isEmpty()) return "";
        if(s.length() == 1) return s;
        String longestPalindrome = "";
        int n = s.length();

        // check all the substrings
        for ( int i =0; i < n ; i++ ) {
            for (int j = i +1; j <= n; j++) {
                String subString = s.substring(i,j);
                if (isPalindrome(subString) && subString.length() > longestPalindrome.length()) {
                    longestPalindrome = subString;
                }
            }
        }
        System.out.println(longestPalindrome);
        return longestPalindrome;

    }

    private boolean isPalindrome(String subString) {
        int left = 0;
        int right = subString.length() - 1;
        while(left < right){
            if(subString.charAt(left++) != subString.charAt(right--)){
                return false;
            }
        }
        return true;
    }


    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int len = expandAroundCenter(s,i,i);
            // Even length palindrome
            int len1 = expandAroundCenter(s,i, i+1);

            int maxLen = Math.max(len, len1);

            // Update the start and end position if longer palindrome found
            if( maxLen > end - start ) {
                start = i - (maxLen - 1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left , int right) {
        while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left -1;
    }



}
