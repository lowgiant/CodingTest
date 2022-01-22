public class LongestPalindromeSubstring {
    public static String longestPalindromeSubstring(String word){
        String result = "";
        for(int index =0 ; index<word.length() ; index++) {
            int len = Math.max(helper(word,index,index), helper(word,index,index+1));
            if(result.length()<len) {
                result = word.substring(index-(len-1)/2, index+len/2+1);
            }
        }
        return result;
    }

    public static int helper(String str, int s, int e) {
        if(s<0 || e>=str.length()) return 0;
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)) {
            s--;
            e++;
        }
        return e-s-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubstring("cvvd"));
    }
}
