package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }

        int reverse = 0;
        int og = x;

        while (og > 0)
        {
            reverse = og % 10 + reverse * 10;
            og /= 10;
        }

        return reverse == x;
    }
}
