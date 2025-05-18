package org.example.validPlindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int left = 0;
        int  right = s.length() -1;
        while (left < right ){
            // check left and skip if non-alphanumeric

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // check right and skip if non-alphanumeric

            while ( left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // convert to lower case and compare characters at left and right, if match keep comparing
            //
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}
