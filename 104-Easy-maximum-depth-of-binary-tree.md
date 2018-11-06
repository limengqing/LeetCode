https://leetcode.com/problems/maximum-depth-of-binary-tree/

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDep = maxDepth(root.left);
            int rightDep = maxDepth(root.right);
            return leftDep > rightDep ? (1 + leftDep) : (1 + rightDep);
        }
    }
}
```
