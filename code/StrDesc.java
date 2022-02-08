import java.util.Arrays;

public class StrDesc{
	public static String strDesc(String s){
		char[] sol = s.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(strDesc("Zbcdefg"));
	}
}