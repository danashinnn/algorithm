import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        int[] stageNum = new int[N]; // 해당 stage를 통과한 사람의 수
        int[] user = new int[N]; // 각 스테이지별 스테이지에 도달한 플레이어 수

        double[][] loss = new double[N][2];
        //[[1, 실패율],[2, 실패율],[3, 실패율] ...]

        for( int i = 0; i < stages.length ; i ++){
            for(int k = 1; k < N+1; k++) {
                if (stages[i] > k) {
                    stageNum[k-1] += 1;
                    //7 4 2 1 1
                    //각 스테이지를 클리어한 사람 수
                }
                if (stages[i] >= k) {
                    user[k-1] += 1;
                    //8 7 4 2 1
                    //각 스테이지에 머무르거나 이미 통과한 사람 수
                }
            }
        }

        for(int j = 0; j < N ; j++){
            loss[j][0] = j+1;
            loss[j][1] = ((user[j]-stageNum[j])/(double)user[j]);
        }//실패율 구하기

        for (int i = 0; i < loss.length;i++){
            for(int j = i+1; j < loss.length;j++){
                double[] temp = {};
                if (loss[i][1] < loss[j][1]) {
                    temp = loss[i];
                    loss[i] = loss[j];
                    loss[j] = temp;
                    //실패율에 따라 리스트의 위치를 바꿈
                }
                if (loss[i][1] == loss[j][1] && loss[i][0] > loss[j][0]){
                    temp = loss[i];
                    loss[i] = loss[j];
                    loss[j] = temp;
                    //실패율이 동일할 경우의 스테이지를 오름차순으로 정렬
                }
            }
        }

        for (int i = 0; i < loss.length;i++){
            int score = (int) loss[i][0];
            answer[i] = score;
        }//answer 리스트에 순차적으로 순위를 넣음

        return answer;
    }
}