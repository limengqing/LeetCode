https://leetcode.com/problems/longest-palindromic-substring/

```java
class Solution {
    int start = 0;
    int length = 1;
    
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        for (int i=0; i<s.length()-1; i++) {
            expand(s, i, i);
            expand(s, i, i+1);
        }
        
        return s.substring(start, start + length);
    }
    
    public void expand(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        
        
        if (right - left - 1 > length) {
            start = left + 1;
            length = right - left - 1 ;
        }
    }
    
}
```
