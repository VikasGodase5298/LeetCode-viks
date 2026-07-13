class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;

        if(num < 0){
            return false;
        }

        while(num != 0){
            int lastDigit = num % 10;
            if(rev < Integer.MIN_VALUE/10 || rev > Integer.MAX_VALUE){
                return false;
            }
            rev = (rev * 10) + lastDigit;
            num /= 10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}