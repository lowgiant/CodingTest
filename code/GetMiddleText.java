public class GetMiddleText {
	public static String getMiddleText(String s){
		String answer = "";
		int textLength = s.length();
		int middleIndex = s.length()/2+1;

		if(textLength % 2 == 0) {
			answer += s.substring(middleIndex-2, middleIndex);
		} else{
			answer += s.substring(middleIndex-1,middleIndex);
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(getMiddleText("qwer"));
	}
}
