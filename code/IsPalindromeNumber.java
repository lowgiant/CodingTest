public class IsPalindromeNumber {
    public static boolean isPalindromeNumber(int x) {

        if (x <= 0) {
            return x == 0;
        }

        final int numDigits = (int)(Math.floor(Math.log10(x))) + 1;
        int msdMask = (int)Math.pow(10, numDigits - 1);
        for (int i = 0; i < (numDigits / 2); ++i) {
            if (x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask; // Remove the most significant digit of x.
            x /= 10;      // Remove the least significant digit of x.
            msdMask /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(333));

    }
}
