https://leetcode.com/problems/sort-array-by-parity/

```java
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int low = 0;
        int high = A.length-1;
        int odd = firstOddIndex(A, low, high);
        int even = lastEvenIndex(A, high, low);
        while (odd < even) {
            exchange(A, odd, even);
            odd = firstOddIndex(A, odd+1, high);
            even = lastEvenIndex(A, even-1, low);
        }
        return A;
    }
    
    public void exchange(int[] A, int a, int b) {
        int i = A[a];
        A[a] = A[b];
        A[b] = i;
    }
    
    public int firstOddIndex(int[] A, int low, int high) {
        while (low < high) {
            if (A[low] % 2 == 1) {
                return low;
            } else {
                low++;
            }
        }
        return high;
    }
    
    public int lastEvenIndex(int[] A, int high, int low) {
        while (high>low) {
            if (A[high] % 2 == 0) {
                return high;
            } else {
                high--;
            }
        }
        return low;
    }
}
```
