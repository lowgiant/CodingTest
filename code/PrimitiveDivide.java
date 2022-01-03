public class PrimitiveDivide {
    public static int divide(int x, int y) {

        int result = 0;
        int power = 32;
        long yPower = (long)y << power;
        while (x >= y) {
            while (yPower > x) {
                yPower >>>= 1;
                --power;
            }
            result += 1 << power;
            x -= yPower;
        }
        return result;
    }

    public static void main(String[] args) {
        int Divide = divide(10,5);
        System.out.println(Divide);
    }
}
