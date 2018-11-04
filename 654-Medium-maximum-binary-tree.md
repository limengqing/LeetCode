https://leetcode.com/problems/maximum-binary-tree/

`

tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        
        TreeNode root = null;
        for (int i = 0; i< nums.length; i++) {
            root = addNode(root, nums[i]);
        }
        
        return root;
    }
    
    public TreeNode addNode(TreeNode root, int i) {
        if (root == null) {
            root = new TreeNode(i);
        }
        else if (root.val < i) {
            TreeNode newRoot = new TreeNode(i);
            newRoot.left = root;
            root = newRoot;
        }
        else {
            root.right = addNode(root.right, i);
        }
        return root;
    }
}
```
