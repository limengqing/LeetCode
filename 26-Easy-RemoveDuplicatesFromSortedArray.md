https://leetcode.com/problems/remove-duplicates-from-sorted-array/

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int s = 1;
        int current = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i];
                nums[s] = nums[i];
                s++;
            }
        }
        return s;
    }
}
```
