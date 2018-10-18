
https://leetcode.com/problems/reverse-bits

```java
public class Solution {

  public static int reverseBits16(int n) {
    int high = n >>> 8;
    int low = (n << 24) >>> 24;
    int rhigh = reverseBits8(high);
    int rlow = reverseBits8(low);

    return (rlow << 8) | rhigh;
  }

  public static int reverseBits8(int n) {
    int r7 = n >>> 7;
    int r6 = (n & 64) >>> 5;
    int r5 = (n & 32) >>> 3;
    int r4 = (n & 16) >>> 1;
    int r3 = (n & 8) << 1;
    int r2 = (n & 4) << 3;
    int r1 = (n & 2) << 5;
    int r0 = (n & 1) << 7;

    return r7 | r6 | r5 | r4 | r3 | r2 | r1 | r0;
  }

  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int high = n >>> 16;
    int low = (n << 16) >>> 16;
    int rhigh = reverseBits16(high);
    int rlow = reverseBits16(low);

    return (rlow << 16) | rhigh;
  }
}
```