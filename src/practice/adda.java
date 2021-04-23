package practice;

public class adda {

}
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] num = new int[moves.length];
        for(int i=0; i<board[0].length; i++){
            for(int j=0; j<board[0].length; j++){
                if(moves[i]==j&&board[i][j]!=0){
                    num[i] = board[i][j];
                    
                    }
                }
            }
        for(int i=0; i<num.length-1; i+=2){
            if(num[i]==num[i+1]){
                        answer+=2;
        }
        }
        
        
        return answer;
    }
}