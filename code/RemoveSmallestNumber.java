import java.util.Arrays;

public class RemoveSmallestNumber {
	public static int[] removeSmallestNumber(int[] arr) {
		if (arr.length <= 1) {
			return new int[] {-1};
		}
		int smallest = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(i -> i != smallest)
			.toArray();
	}

	public static void main(String[] args) {
		int[] arr = removeSmallestNumber(new int[] {4, 3, 2, 1});

		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
	}
}