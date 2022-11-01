
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0, j = 0;
        for(int i=0; i<s.length(); i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}
