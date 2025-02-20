package Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s)
    {
        if (s.length() % 2 != 0)
        {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for(char p : s.toCharArray())
        {
            if(p == '(' || p=='{'||p =='[')
            {
                stack.push(p);
            }

            else if(p ==')' && !stack.isEmpty() && stack.peek() == '(')
            {
                stack.pop();
            }

            else if(p =='}' && !stack.isEmpty() && stack.peek() == '{')
            {
                stack.pop();
            }

            else if(p ==']' &&!stack.isEmpty() && stack.peek() =='[')
            {
                stack.pop();
            }

            else
            {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
