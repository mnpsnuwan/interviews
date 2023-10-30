// 383. Ransom Note
// Easy
//
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.
//
//    Example 1:
//    Input: ransomNote = "a", magazine = "b"
//    Output: false
//
//    Example 2:
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false
//
//    Example 3:
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true
//
//    Constraints:
//    1 <= ransomNote.length, magazine.length <= 105
//    ransomNote and magazine consist of lowercase English letters.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazingLetters = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            int count = magazingLetters.getOrDefault(c, 0);
            magazingLetters.put(c, count + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            int count = magazingLetters.getOrDefault(c, 0);

            if(count == 0) {
                return false;
            }
            else {
                magazingLetters.put(c, count - 1);
            }
        }
        return true;
    }
}