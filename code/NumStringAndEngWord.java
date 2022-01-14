public class NumStringAndEngWord {
    public static int numStringAndEngWord(String word){
        int result = 0;
        String[] str = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};

        if(!word.matches("[+-]?\\d*(\\.\\d+)?")){
            for(int i=0; i< str.length; i++){
                word = word.replace(str[i],num[i]);
            }
        }

        result = Integer.parseInt(word);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numStringAndEngWord("one4seveneight"));
        System.out.println(numStringAndEngWord("23four5six7"));
        System.out.println(numStringAndEngWord("2three45sixseven"));
        System.out.println(numStringAndEngWord("123"));

    }
}
