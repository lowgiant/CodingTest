import java.util.Arrays;

public class FindKimInSeoul{

	public static String findKimInSeoul(String[] seoul){
		int index = Arrays.asList(seoul).indexOf("Kim");

		return "김서방은 " + index + "에 있다.";
	}

	public static void main(String[] args) {
		String[] seoul = {"Seoul","Kim"};

		System.out.println(findKimInSeoul(seoul));
	}

}