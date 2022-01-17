public class ValidPalindrome {
    public static boolean validPalindrome(String word){
        word = word.toLowerCase();
        word = word.replaceAll("[^a-z0-9]", "");

        StringBuffer sb = new StringBuffer(word);

        return  word.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("race a car"));
        System.out.println(validPalindrome("A man, a plan, a canal: Panama"));
    }
}
