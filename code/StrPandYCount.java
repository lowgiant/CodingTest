public class StrPandYCount {
	public static Boolean strPandYCount(String s){
		s = s.toUpperCase();
		return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}

	public static void main(String[] args) {
		System.out.println(strPandYCount("pPoooyY"));
	}
}
