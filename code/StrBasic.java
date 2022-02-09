public class StrBasic {
	public static Boolean strBasic(String s) {

		if (s.length() == 4 || s.length() == 6)
			return s.matches("(^[0-9]*$)");
		return false;
	}

	public static void main(String[] args) {
		System.out.println(strBasic("1234"));
	}
}