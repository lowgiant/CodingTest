public class NumberAndAdditionOfFactors {
    public static int numberAndAdditionOfFactors(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) { // 1
            if (i % Math.sqrt(i) == 0) { // 2
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int left = 24;
        int right = 27;

        System.out.println(numberAndAdditionOfFactors(left, right));
    }

}
