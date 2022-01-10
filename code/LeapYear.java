public class LeapYear {
    public static int leapYear(int year){
        int result = 0;
        if (1 <= year && year<=4000){
            if (year % 4 == 0) {
                if(year % 400 == 0){
                    result += 1;
                }else if(year % 100 == 0){
                    result += 0;
                }
            } else {
                result += 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(leapYear(400));
        System.out.println(leapYear(-1));
        System.out.println(leapYear(400222));


    }
}
