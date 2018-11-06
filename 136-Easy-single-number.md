https://leetcode.com/problems/single-number/

```java
// sort and compare by 2
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i <= nums.length-3) {
            if (nums[i] == nums[i+1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }
        
        return nums[nums.length-1];
    }
    
}
```
a better solution: using `^`
```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
```
