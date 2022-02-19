public class EvenOrOdd{
	public static String evenOrOdd(int num){
		return num % 2 == 0 ? "Even": "Odd";
	}

	public static void main(String[] args) {
		System.out.println(evenOrOdd(0));
		System.out.println(evenOrOdd(3));
		System.out.println(evenOrOdd(4));
	}
}