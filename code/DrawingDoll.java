import java.util.Stack;

public class DrawingDoll {
    public static int drawingDoll(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> bucket = new Stack<Integer>();

        for(int move : moves){

            for(int index = 0; index < board.length; index ++){
                if(board[index][move-1] == 0){
                    continue;
                } else{
                    System.out.println("전체 " + board[index][move-1]);
                    if(!bucket.isEmpty() && board[index][move-1] == bucket.peek()){
                        System.out.println(board[index][move-1] +" "+ bucket.peek());
                        result += 2;
                        bucket.pop();
                    } else {
                        bucket.add(board[index][move-1]);
                    } board[index][move-1] = 0;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(drawingDoll(board,moves));
    }

}
