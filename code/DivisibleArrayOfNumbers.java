import java.util.Arrays;

public class DivisibleArrayOfNumbers {

	public static int[] divisibleArrayOfNumbers(int[] arr, int divisor) {

		int[] anwser = Arrays.stream(arr).filter(element -> element % divisor ==0).toArray();
		if(anwser.length == 0){
			anwser = new int[] {-1};
		}

		return anwser;
	}

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 11;
		int[] divisibleArrayOfNumbers = divisibleArrayOfNumbers(arr,divisor);

		for(int index: divisibleArrayOfNumbers){
			System.out.println(index);
		}
	}

}