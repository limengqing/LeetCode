https://leetcode.com/problems/unique-email-addresses/

```java
class Solution {
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        Map<String, Set<String>> m = new HashMap<>();
        for (String email : emails) {
            int pat = email.indexOf((int) '@');
            String domain = email.substring(pat+1, email.length());
            
            int leftEnd = email.indexOf((int) '+');
            if (leftEnd < 0) leftEnd = pat;

            StringBuilder sb = new StringBuilder();
            String left= email.substring(0, leftEnd);
            for (int j=0; j<left.length(); j++) {
                char ca = left.charAt(j);
                if (ca!= '.') sb.append(ca);
            }
            String name = sb.toString();
            
            Set s = m.get(domain);
            if (s == null) {
                Set<String> set = new HashSet<>();
                set.add(name);
                m.put(domain, set);
                count++;
            } else if (!s.contains(name)) {
                s.add(name);
                count++;
            }
        }
        
        return count;
    }
    
}
```
