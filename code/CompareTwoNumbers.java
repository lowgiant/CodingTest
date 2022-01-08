public class CompareTwoNumbers {
    public static String compareTwoNumbers(int x , int y) {
        String result = "";

        if (x<y){
            result += "<";
        } else if(x>y){
            result += ">";
        } else {
            result += "==";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(compareTwoNumbers(2,2));
        System.out.println(compareTwoNumbers(12,2));
        System.out.println(compareTwoNumbers(1,2));
    }
}
