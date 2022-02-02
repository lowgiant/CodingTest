public class RemainderBeingOne {
	public static int remainderBeingOne(int n) {
		int answer = 0;
		for (int index = 2; index < n; index++) {
			if (n % index == 1) {
				answer = index;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(remainderBeingOne(12));
	}

}