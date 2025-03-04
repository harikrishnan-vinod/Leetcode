package Easy;

public class ValidPalindrome{
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;

        while(l < r)
        {
            while( l < r && !Character.isLetterOrDigit(s.charAt(l)))
            {
                l++;
            }

            while( l < r && !Character.isLetterOrDigit(s.charAt(r)))
            {
                r--;
            }
            if(Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r)))
            {
                return false;
            }
            ++l;
            --r;
        }
        return true;
    }
}

