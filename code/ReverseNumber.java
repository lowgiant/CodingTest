public class ReverseNumber {
    public static long reverseNumber(int x){
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0){
            result = result  * 10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return x < 0 ? - result : result;
    }

    public static void main(String[] args) {
        long reversePositiveNumber = reverseNumber(102);
        long reverseNegativeNumber = reverseNumber(-102);

        System.out.println(reversePositiveNumber);
        System.out.println(reverseNegativeNumber);
    }
}
