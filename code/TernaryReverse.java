public class TernaryReverse {
    public static int ternaryReverse(int n) {
        String answer = "";
        int ternary = 3;
        while (n >= ternary) {
            answer += n % ternary;
            n /= ternary;
        }
        answer += n;
        return Integer.parseInt(answer, 3);
    }

    public static void main(String[] args) {
        System.out.println(ternaryReverse(125));
    }
}
