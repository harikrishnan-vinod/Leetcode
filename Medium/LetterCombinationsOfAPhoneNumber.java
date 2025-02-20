package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
        {
            return result;
        }
        Map<Character,String> jsp = new HashMap<>();
        jsp.put('2',"abc");
        jsp.put('3',"def");
        jsp.put('4',"ghi");
        jsp.put('5',"jkl");
        jsp.put('6',"mno");
        jsp.put('7',"pqrs");
        jsp.put('8',"tuv");
        jsp.put('9',"wxyz");

        backtrack(digits, 0,"" ,result, jsp);
        return result;
    } 

    private void backtrack(String digits,int index, String current, List<String> results, Map<Character,String> map)
    {
        if(index == digits.length())
        {
            results.add(current);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for(final char letter: letters.toCharArray())
        {
            backtrack(digits, index + 1, current + letter, results, map);
        }
    }
}
