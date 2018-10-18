```java
/**
 * @see https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
class Solution {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int totalSize = nums1.length + nums2.length;
    int[] nums = new int[totalSize];
    if (nums1.length == 0) {
      nums = nums2;
    } else if (nums2.length == 0) {
      nums = nums1;
    } else {
      sort(nums, nums1, nums2);
    }

    if (totalSize % 2 == 0) {
      double num1 = (double) nums[totalSize / 2];
      double num2 = (double) nums[totalSize / 2 - 1];
      return (num1 + num2) / 2;
    } else {
      return (double) nums[(totalSize - 1) / 2];
    }
  }

  private void sort(int[] target, int[] nums1, int[] nums2) {
    int pos1 = 0;
    int pos2 = 0;
    int pos = 0;

    while (pos1 < nums1.length && pos2 < nums2.length) {
      if (less(nums1[pos1], nums2[pos2])) {
        target[pos] = nums1[pos1];
        pos1++;
      } else {
        target[pos] = nums2[pos2];
        pos2++;
      }
      pos++;
    }
    
    while (pos1 < nums1.length) {
      target[pos] = nums1[pos1];
      ++pos1;
      ++pos;
    }
    
    while (pos2 < nums2.length) {
      target[pos] = nums2[pos2];
      ++pos2;
      ++pos;
    }

  }

  private boolean less(int a, int b) {
    return a < b;
  }


}
​````
```