import java.util.*;

class Solution {
    public static void main(String[] args)
    {
        int n = 30;
        int numlist[] = {10000,20,36,47,40,6,10,7000};
        Solution solution = new Solution();
        for(int i : solution.solution(numlist , n)) {
            System.out.println(i);
        }
    }


    int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] index = new int[numlist.length];  //distance 정렬할때 distance 값의 index 도 같이 정렬하기 위함
        double[] distance = new double[numlist.length];
        int i;
        
        initialize(index);
        calDistance(distance, numlist, n);
        sortArray(distance, index);
        
        for(i=0; i<numlist.length; i++)
        {
            answer[i] = numlist[index[i]];
        }
                
        return answer;
    }
    
    void sortArray (double distance[], int index[])
    {
        int i,j;
        double min = distance[0];
        int minIndex = index[0];
        double tempDouble = 0;
        int temp;
        
        //distance[0] ~ distance[lennth] 중에서 최소값 찾아서 distance[0] 으로 보내기
        //distance[1] ~ distance[lennth] 중에서 최소값 찾아서 distance[1] 으로 보내기
        // ... length 만큼 반복
        for(j=0; j<distance.length; j++)
        {
            min = distance[j];
            minIndex = j;
            for(i=j; i<distance.length; i++)
            {   
                //distance 의 최소값 min과 최소값을 가지고 있는 minIndex 찾기
                if(distance[i] < min)
                {
                    min = distance[i];
                    minIndex = i;
                }
            }
            //distance sorting
            tempDouble = distance[j];
            distance[j] = min;
            distance[minIndex] = tempDouble;
            //index sorting
            temp = index[j];
            index[j] = index[minIndex];
            index[minIndex] = temp;
        }
    }
    
    void initialize(int index[])
    {
        for(int i=0; i<index.length; i++)
            index[i] = i;
    }
    
    void calDistance(double distance[], int numlist[], int n)
    {
        for(int i=0; i<numlist.length; i++)
        {
            //양수면 앞에 배열 되어야 하므로 0.5 만큼 추가 감소
            if(numlist[i] - n > 0)
                distance[i] = numlist[i] -n -0.5;
            //음수면 양수로 만들어야 하니깐 반대로 빼기
            else
                distance[i] = n - numlist[i];
        }
    }
    
}