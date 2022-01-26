public class AddMissingNumbers {
    public static int AddMissingNumbers(int[] numbers){
        int result = 45;

        for(int number : numbers) {
            result -= number;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(AddMissingNumbers(numbers));
    }
}
