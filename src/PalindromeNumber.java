/*
Input: 121
Output: true

Input: -121
Output: false

Input: 10
Output: false
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;

        int halfreverse = 0;
        while(x > halfreverse) {
            halfreverse = halfreverse * 10 + x % 10;
            x /= 10;
        }
        return halfreverse == x || halfreverse /10 == x;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        System.out.println(solution.isPalindrome(-1));
        System.out.println(solution.isPalindrome(10010));

        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(11));
        System.out.println(solution.isPalindrome(111));
        System.out.println(solution.isPalindrome(222222222));
    }


}
