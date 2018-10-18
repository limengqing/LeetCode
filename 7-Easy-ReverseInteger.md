```java
/**
 * @see https://leetcode.com/problems/reverse-integer/
 */
class Solution {

  public int reverse(int x) {
    List list = new LinkedList<Long>();

    while (x != 0) {
      int i = x % 10;
      list.add(Long.valueOf(i));
      x = x / 10;
    }
    
    int n = list.size();
    
    long y = 0;
    for (int i = n; i > 0; i--) {
      y += Math.pow(10, i - 1) * (long) list.get(n - i);
    }
    if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
      return 0;
    }
    
    return (int) y;
  }
}
```