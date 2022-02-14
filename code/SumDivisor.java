public class SumDivisor {
	public static int sumDivisor(int num) {
		int answer = 0;
		for (int index = 1; index <= num / 2; index++) {
			if (num % index == 0) {
				answer += index;
			}
		}
		return answer + num;
	}

	public static void main(String[] args) {
		System.out.println(sumDivisor(12));
		System.out.println(sumDivisor(5));
	}
}
