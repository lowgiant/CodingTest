public class StrReverse {
	public static int[] strReverse(long n) {
		String str = String.valueOf(n);
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		String[] ss = sb.toString().split("");

		int[] answer = new int[ss.length];
		for (int i = 0; i < ss.length; i++) {
			answer[i] = Integer.parseInt(ss[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] strReverseArray = strReverse(12345);

		for (int index = 0; index < strReverseArray.length; index++) {
			System.out.println(strReverseArray[index]);
		}

	}
}