class Solution {
    public String removeDuplicateLetters(String s) {
        int length = s.length();
        int[] lastOccurrence = new int[26];
        
        
        for (int i = 0; i < length; i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        
        Deque<Character> stack = new ArrayDeque<>();
        int inStackMask = 0;

        
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

           
            if (((inStackMask >> (currentChar - 'a')) & 1) == 1) {
                continue;
            } 
            while (!stack.isEmpty() && stack.peekLast() > currentChar 
                    && lastOccurrence[stack.peekLast() - 'a'] > i) {
                char removed = stack.pollLast();
                inStackMask &= ~(1 << (removed - 'a'));
            }

            
            stack.addLast(currentChar);
            inStackMask |= (1 << (currentChar - 'a'));
        }

        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}