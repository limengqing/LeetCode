

https://leetcode.com/problems/valid-number/

```java
class Solution {
    public boolean isNumber(String s) {
        if (s.isEmpty()) {
            return false;
        }
        
        char[] ca = s.toCharArray();
        int index = 0;
        
        // [{' '}] optional whiteSpaces
        while (index < ca.length && ca[index] == ' ') {
            index++;
        }
        // [('+'|'-')] optional sign flag
        if (index < ca.length && isSign(ca[index])) {
            index++;
        }
        
        // num part 
        boolean numFlag = false;
        if (index < ca.length && isNum(ca[index])) {
            index = untilNonNum(index, s);
            numFlag = true;
        }
        if (index < ca.length && ca[index] == '.') {
            index++;
        }
        if (index < ca.length && isNum(ca[index])) {
            index = untilNonNum(index, s);
            numFlag = true;
        }
        if (!numFlag) return false;
        
        // ['e' ['+'|'-'] {'0..9'}] optional exponent part 
        if (index < ca.length && ca[index] == 'e') {
            index++;
            if (index < ca.length && isSign(ca[index])) {
                index++;
            }
            if (index < ca.length && isNum(ca[index])) {
                index = untilNonNum(index, s);
            } else {
                return false;
            }
        }
        // [{' '}] optional whiteSpaces
        while (index < ca.length && ca[index] == ' ') {
            index++;
        }
        return index == ca.length;
    }

    public static boolean isSign(char c) {
        return c == '+' || c == '-';
    }
    
    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }
    
    public static int untilNonNum(int i, String s) {
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
        }
        return i;
    }
}
```

