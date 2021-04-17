class Solution {
    public String removeDuplicates(String s, int k) {
        if (s.length() < k) return s;
        StringBuilder newString = new StringBuilder();
        int begin = 0;
        int end = 1;
        char lastLetter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (lastLetter != s.charAt(i)) {
                lastLetter = s.charAt(i);
                newString.append(s, begin, end);
                begin = end;
            }
            end++;
            if (end - begin == k) {
                if (s.length() > end) {
                    lastLetter = s.charAt(end);
                }
                begin = end;
            }
        }
        newString.append(s, begin, end);
        if (!s.equals(String.valueOf(newString))) {
            return removeDuplicates(String.valueOf(newString), k);
        } else {
            return String.valueOf(newString);
        }
    }
}