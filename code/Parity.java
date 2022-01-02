public class Parity {
    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            result ^= 1;
            x &= (x - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        short ParityZero = parity(011000);
        short ParityOne = parity(011111);
        System.out.println(ParityZero);
        System.out.println(ParityOne);

    }
}
