public class StringPattern{
	public static String stringPattern(int count){
		return new String(new char [count/2+1]).replace("\0", "수박").substring(0,count);
	}

	public static void main(String[] args) {
		System.out.println(stringPattern(10));
	}
}