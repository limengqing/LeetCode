https://leetcode.com/problems/jewels-and-stones/

```java
class Solution {
    public int numJewelsInStones(String J, String S) {
        int s = 0;
        for (int i=0; i<S.length(); i++) {
          if (J.indexOf((int)S.charAt(i))>=0) {
            s++;
          }
        }
        return s;
    }
    
}
```
