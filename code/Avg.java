import java.util.Arrays;

public class Avg {
	public static double avg(int[] arr) {
		return Arrays.stream(arr).average().orElse(0);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};

		System.out.println(avg(arr));
	}
}