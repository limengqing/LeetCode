https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

```java
class Solution {
    public int minAddToMakeValid(String S) {
        int r = 0;
        int l = 0;
        for (int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if (c == '(') {
                l++;
            } else if (c == ')') {
                if (l > 0) {
                    l--;   
                } else {
                    r++;
                }
            }
        }
        return l + r;
    }
}
```
