https://leetcode.com/problems/longest-common-prefix/

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        int l = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int li = strs[i].length();
            if (l > li) l = li;
        }
        
        String pre = "";
        int index = 0;
        while (index < l) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (c != strs[i].charAt(index)) {
                    return pre;
                }
            }
            pre += c;
            index++;
        }
        
        return pre;
    }
}
```
