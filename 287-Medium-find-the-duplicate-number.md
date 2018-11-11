https://leetcode.com/problems/find-the-duplicate-number/

1. using the set
2. using a flag 
3. !!! two pointers

not the best: 

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] flag = new int[n / 32 + 1];
        for (int num : nums) {
            int pos = num / 32;
            int f = num % 32;
            if (contains(flag, pos, f)) {
                return num;
            } else {
                setFlag(flag, pos, f);
            }
        }
        return 0;
    }
    
    public void setFlag(int[] flag, int pos, int f) {
        int i = flag[pos];
        flag[pos] = i | (1 << f);
    }
    
    public boolean contains(int[] flag, int pos, int f) {
        int i = flag[pos];
        return (i & (1 << f)) != 0;
    }
}
```
