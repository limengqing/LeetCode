https://leetcode.com/problems/to-lower-case/

```java
class Solution {
    int s = 'A' - 'a';
    int low = 'A';
    int high = 'Z';
    public String toLowerCase(String str) {
        char[] ca = str.toCharArray();
        for (int i=0;i<ca.length;i++) {
            char c = ca[i];
            if (c>= low && c<=high) {
                ca[i] = (char) (c - s);
            }
        }
        return new String(ca);
    }
}
```
