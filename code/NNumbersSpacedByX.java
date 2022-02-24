import java.util.Arrays;

public class NNumbersSpacedByX {

	public static long[] nNumbersSpacedByX(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for (int index = 1; index < n; index++) {
			answer[index] = answer[index - 1] + x;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(nNumbersSpacedByX(2, 4)));
	}
}