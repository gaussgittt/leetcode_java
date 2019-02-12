/*
Input: haystack = "hello", needle = "ll"
Output: 2

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */


public class c28_ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length() || haystack == null || needle == null)
            return -1;

        if(needle.length() == 0)
            return 0;

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args){
        c28_ImplementstrStr sol = new c28_ImplementstrStr();

        String haystack = "hello";
        String needle = "ll";

        System.out.println(sol.strStr(haystack, needle));
    }
}
