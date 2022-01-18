public class ReverseString {
    public static void reverseString(char[] x){
        System.out.println(x);
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        System.out.println(sb.reverse().toString().toCharArray());
    }

    public static void main(String[] args) {
        char[] word = {'h','e', 'l','l','o'};
        reverseString(word);
    }
}