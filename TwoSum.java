public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int wish = target - nums[i];
            if (map.containsKey(wish)) {
                return new int[]{i, map.get(wish)};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("not found");
    }
}
