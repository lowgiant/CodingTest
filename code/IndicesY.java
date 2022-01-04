public class IndicesY {
    public static double IndicesY(double x, int y) {

        double result = 1.0;
        long indices = y;
        if (y < 0) {
            indices = -indices;
            x = 1.0 / x;
        }
        while (indices != 0) {
            if ((indices & 1) != 0) {
                result *= x;
            }
            x *= x;
            indices >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        double IndicesValue = IndicesY(2,5);
        System.out.println(IndicesValue);
    }
}
