https://leetcode.com/problems/string-to-integer-atoi/

```java
class Solution {
    public int myAtoi(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        char[] ca = str.toCharArray();
        int res = 0;
        boolean negative = false;
        
        // 1. discard whitespaces
        int index = 0;
        while (index < ca.length && ca[index] == ' ') {
            index++;
        }
        
        // 2. optional initial plus/minus
        if (index < ca.length) {
            if (ca[index] == '-') {
                negative = true;
                index++;
            } else if (ca[index] == '+') {
                index++;
            }
        }
      
        
        int min = Integer.MIN_VALUE / 10;
        int max = Integer.MAX_VALUE / 10;
        
        // 3. integral chars
        while (index < ca.length) {
            char c = ca[index];
            
            // integral char
            if (c <= '9' && c >= '0') {
                int i = (int) c - '0';
                
                // check range
                if (negative) {
                    if (res < min || (res == min && i >= 8)) {
                        return Integer.MIN_VALUE;   
                    }
                } else {
                    if (res > max || (res == max && i >= 7)) {
                        return Integer.MAX_VALUE;
                    }
                }
                
                res *= 10;
                if (negative) {
                    res -= i;
                } else {
                    res += i;
                }
            }
            // non-integral char
            else {
                break;
            }
            index++;
        }
        
        return res;
    }
}
```

