https://leetcode.com/problems/counting-bits/

```java
class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num+1];
        for (int i=0; i<=num; i++) {
            if (i == 0 || i == 1) {
                a[i] = i;
            } else {
                a[i] = a[i%2] + a[i/2];
            }
        }
        return a;
    }
}
```
