public class AddYinAndYang {

    public static int addYinAndYang(int[] absolutes, boolean[] signs) {
        int result = 0;

        for (int index = 0; index < signs.length; index++) {
            if (signs[index]) {
                result += absolutes[index];
            } else {
                result -= absolutes[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.println(addYinAndYang(absolutes,signs));

    }
}
