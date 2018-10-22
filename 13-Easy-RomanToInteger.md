https://leetcode.com/problems/roman-to-integer/

```java
class Solution {
    public int romanToInt(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int current=0, sum=0, max=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': 
                    current = 1;
                    break;
                case 'V': 
                    current = 5;
                    break;
                case 'X': 
                    current = 10;
                    break;
                case 'L': 
                    current = 50;
                    break;
                case 'C': 
                    current = 100;
                    break;
                case 'D': 
                    current = 500;
                    break;
                case 'M': 
                    current = 1000;
                    break;
            }
            if (current < max) {
                current *= -1;
            } else {
                max = current;
            }
            sum += current;
        }
        return sum;
    }
}
```