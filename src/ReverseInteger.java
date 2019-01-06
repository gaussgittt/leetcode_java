/*
Input: 123
Output: 321

Input: 120
Output: 21
 */

public class ReverseInteger {
    public int reverse(int n) {
        int reverse_n = 0;

        while(n != 0){
            int temp = reverse_n * 10 + n % 10;
            n = n / 10;

            if ( temp / 10  != reverse_n){
                reverse_n = 0;
                break;
            }

            reverse_n = temp;

        }
        return reverse_n;
    }

    public int reverse2(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(100));
        System.out.println(solution.reverse2(1000003));
    }


}
