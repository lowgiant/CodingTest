public class HarshadNumber {

	public static boolean isHarshad(int num) {
		int sum = Integer.toString(num).chars().map(n -> n - '0').sum();
		return num % sum == 0;
	}

	public static void main(String[] args) {
		System.out.println(isHarshad(18));
	}
}