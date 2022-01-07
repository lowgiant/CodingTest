public class PrimitiveMultiply {
    public static long multiply(long x, long y) {

        long sum = 0;
        while (x != 0) {

            if ((x & 1) != 0) {
                sum = add(sum, y);
            }
            x >>>= 1;
            y <<= 1;
        }
        return sum;
    }

    private static long add(long a, long b) {
        return b == 0 ? a : add(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
        System.out.println(multiply(10,20));
    }


}

