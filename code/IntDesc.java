import java.util.Comparator;

public class IntDesc {
	public static long intDesc(long n) {
		return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char)ch)
			.sorted(Comparator.reverseOrder())
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString());
	}

	public static void main(String[] args) {
		System.out.println(intDesc(118372));
	}
}