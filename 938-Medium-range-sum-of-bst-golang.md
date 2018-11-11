https://leetcode.com/problems/range-sum-of-bst/

```go
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func rangeSumBST(root *TreeNode, L int, R int) int {
    if root == nil {
        return 0;
    }
    r := 0
    if root.Val >= L && root.Val <= R {
        r += root.Val
    }
    if root.Val >= L && root.Left != nil {
        r += rangeSumBST(root.Left, L, R)
    }
    if root.Val <= R && root.Right != nil {
        r += rangeSumBST(root.Right, L, R)
    }
    return r
}
```
