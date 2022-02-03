public class CalculateTheShortfall {
	public static long CalculateTheShortfall(int price, int money, int count) {
		long result = price * ((long)count * (1 + count) / 2);

		if(result <= money) {
			return 0;
		} else {
			return result - (long)money;
		}
	}

	public static void main(String[] args) {
		System.out.println(CalculateTheShortfall(3,20,4));
	}
}
