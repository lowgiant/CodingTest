import java.util.Arrays;

public class GcdLcm {

	public static int[] gcdLcm(int a, int b) {
		int[] answer = new int[2];
		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	private static int gcd(int a, int b) {
		int result = 0;
		if (b == 0) {
			result = a;
		} else {
			result = gcd(b, a % b);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(gcdLcm(3, 12)));
	}
}