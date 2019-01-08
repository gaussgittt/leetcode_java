/*
Input: ["flower","flow","flight"]
Output: "fl"

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            int j = 0;

            while(j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)){
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

    public static void main(String[] args){
        LongestCommonPrefix solution = new LongestCommonPrefix();

        System.out.println(solution.longestCommonPrefix(new String[]{"abc", "abd", "add"}));


    }
}
