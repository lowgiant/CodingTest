import java.util.Arrays;
public class LottoRank {
    public static int[] lottoRank(int[] lottos, int[] win_nums){
        int[] result = new int[2];
        int zero = 0;
        int corrent = 0;

        for(int lotto = 0; lotto < lottos.length; lotto++ ){
            for(int win_num = 0; win_num < win_nums.length; win_num++){
                if (lottos[lotto] == 0) {
                    zero++;
                    break;
                }
                if(lottos[lotto]==win_nums[win_num]){
                    corrent++;
                    break;
                }

            }
        }
        result[0] = getRank(zero+corrent);
        result[1] = getRank(corrent);

        return result;
    }

    public static int getRank(int Rank) {
        switch (Rank) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }

    public static void main(String[] args) {
       int[] lotto = {44, 1, 0, 0, 31, 25};
       int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(lottoRank(lotto, win_nums)));

    }
}
