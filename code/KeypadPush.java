public class KeypadPush {
    public static String keypadPush(int[] numbers, String hand){
        String result = "";
        int leftIndex = 10;
        int rightIndex = 12;

        for(int num : numbers) {
            if(num == 0) num = 11;
            switch ( num % 3){
                case 0 -> {
                    result += "R";
                    rightIndex = num;
                }
                case 1 -> {
                    result += "L";
                    leftIndex = num;
                }
                case 2 -> {

                    int minusLeft = (num > leftIndex) ? num - leftIndex : leftIndex - num;
                    int minusRight = (num > rightIndex) ? num - rightIndex : rightIndex - num;

                    int distanceLeft = (minusLeft % 3) + (minusLeft / 3);

                    int distanceRight = (minusRight % 3) + (minusRight / 3);

                    if(distanceLeft < distanceRight){
                        result += "L";
                        leftIndex = num;
                    }  else if (distanceLeft > distanceRight){
                        result += "R";
                        rightIndex = num;

                    } else {
                        result += hand.equals("right") ? "R" : "L";
                        if (hand.equals("right")) rightIndex = num;
                        else leftIndex = num;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand  = "left";

        System.out.println(keypadPush(numbers,hand));
    }
}
