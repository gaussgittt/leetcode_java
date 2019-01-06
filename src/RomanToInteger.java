/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int len = s.length();
        int result = m.get(s.charAt(len - 1));

        for(int i = len - 2; i >= 0; i--){
            if(m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))){
                result += m.get(s.charAt(i));
            } else {
                result -= m.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romanToInt("DCXXI"));// 621
        System.out.println(solution.romanToInt("CCCXLVIII"));// 348
        System.out.println(solution.romanToInt("MCMXCIV")); //1994
    }
}
