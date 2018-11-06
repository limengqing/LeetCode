https://leetcode.com/problems/hamming-distance/

```java
class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i=0;i<31;i++) {
            int a = x >> (i) << 31 >> 31;
            int b = y >> (i) << 31 >> 31;
            if (a != b) count++;
        }
        return count;
    }
}
```
