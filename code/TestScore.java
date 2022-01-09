public class TestScore {
    public static String testScore(int x) {
        String result = "";
        System.out.println(x);

        if (90 <= x && x <= 100) {
            result += "A";
        }
        else if (80 <= x && x <= 89) {
            result += "B";
        }
        else if (70 <= x && x <= 79) {
            result += "C";
        }
        else if (60 <= x && x <= 69) {
            result += "D";
        } else {
            result += "F";
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(testScore(10));
        System.out.println(testScore(99));
        System.out.println(testScore(89));
        System.out.println(testScore(79));
        System.out.println(testScore(69));
        System.out.println(testScore(59));

    }
}

