https://leetcode.com/problems/palindrome-number/

```java
ass Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else if (x % 10 == 0) {
            return false;
        }
        String s = Integer.valueOf(x).toString();
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
```

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int origin = x;
        int reverse = 0;
        while (x != 0) {
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        return origin == reverse;
    }
}
```
