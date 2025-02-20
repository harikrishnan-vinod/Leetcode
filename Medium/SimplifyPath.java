package Medium;

import java.util.Stack;

public class SimplifyPath 
{
    public String simplifyPath(String path) 
    {
        Stack<String> stack = new Stack<>();
        final String [] test = path.split("/");

        for(String items : test)
        {
            if(items.equals("."))
            {
                continue;
            }

            if(items.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }

            else
            {
                    stack.push(items);
            }
        }


        return "/" + String.join("/", stack);
    }
}
