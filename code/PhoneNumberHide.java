public class PhoneNumberHide {

	public static String phoneNumberHide(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}

	public static void main(String[] args) {
		System.out.println(phoneNumberHide("01041110256"));
	}
}