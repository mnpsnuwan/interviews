// Given an integer x, return true if x is a palindrome, and false otherwise.

// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Constraints:
// -231 <= x <= 231 - 1

// Follow up: Could you solve it without converting the integer to a string?

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int originalNumber = x;
        int reversedNumber = 0;

        while (x != 0){
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }

        if(originalNumber >= 0 && originalNumber == reversedNumber){
            return true;
        }
        else{
            return false;
        }
    }
}