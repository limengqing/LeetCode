https://leetcode.com/problems/remove-element/

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                sum++;
                i++;
            }
        }
        return sum;
    }
}
```
