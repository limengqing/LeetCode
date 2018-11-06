https://leetcode.com/problems/find-the-difference/

```java
class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : t.toCharArray()) {
            result ^= (int) c;
        }
        for (char c : s.toCharArray()) {
            result ^= (int) c;
        }
        return (char) result;
    }
}
```
