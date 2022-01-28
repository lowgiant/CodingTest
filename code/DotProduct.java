public class DotProduct {
    public static int dotProduct(int[] a, int[] b){
        int answer = 0;
        for(int index = 0; index < a.length; index++){
            answer += a[index] * b[index];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(dotProduct(a,b));
    }
}
