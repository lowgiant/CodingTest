import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TakeTwoAndAdd {

	public static int[] takeTwoAndAdd(int[] numbers) {
		Set<Integer> answer = new HashSet<>();

		for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {
			for (int lastIndex = firstIndex + 1; lastIndex < numbers.length; lastIndex++) {
				answer.add(numbers[firstIndex] + numbers[lastIndex]);
			}
		}
		return answer.stream().sorted().mapToInt(Integer::intValue).toArray();

	}

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		System.out.println(Arrays.toString(takeTwoAndAdd(numbers)));
	}

}