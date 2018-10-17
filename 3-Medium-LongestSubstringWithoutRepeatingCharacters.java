/**
 * @see https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class Solution {
  public int lengthOfLongestSubstring(String s) {
    int r = 0;
    int l = s.length();
    char[] ca = s.toCharArray();

    for (int i=0;i<l;i++) {
      int ri = 1;

      // now we have ca[i] to ca[j-1];
      for (int j=i+1;j<l;j++) {
        char newChar = ca[j];
        boolean add = false;

        for (int k=i;k<j;k++) {
          if (ca[k] == newChar) {
            add = false;
            break;
          }
          add = true;
        }

        if (add) {
          ri++;
        } else {
          break;
        }
      }

      r = Math.max(r, ri);
    }
    return r;
  }
}