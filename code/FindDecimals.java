public class FindDecimals {

	public static int findDecimals(int n) {
		int count = 0;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				answer++;
			count = 0;
		}

		return answer;

	}

	public static void main(String[] args) {
		System.out.println(findDecimals(10));
		System.out.println(findDecimals(5));
	}
}