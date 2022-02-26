import java.util.ArrayList;
import java.util.Arrays;

public class Deduplication {

	public static int[] deduplication(int[] arr) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int preNum = 10;

		for (int num : arr) {
			if (preNum != num)
				tempList.add(num);
			preNum = num;
		}

		int[] answer = new int[tempList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = tempList.get(i).intValue();
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};

		System.out.println(Arrays.toString(deduplication(arr)));
	}
}