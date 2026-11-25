import java.util.*;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        
        String[] words = s.trim().split("\\s+");
        
        for (String word : words) {
            stack.push(word);
        }
        
        StringBuilder result = new StringBuilder();
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}