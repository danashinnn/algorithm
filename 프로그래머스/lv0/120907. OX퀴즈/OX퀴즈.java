class Solution {
    public  String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" = ");

            if(arr[0].contains(" - ")) {
                String[] arr2 = arr[0].split(" - ");

                int num1 = Integer.parseInt(arr2[0]);
                int num2 = Integer.parseInt(arr2[1]);

                if(num1 - num2 == Integer.parseInt(arr[1])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(arr[0].contains(" + ")) {
                String[] arr2 = arr[0].split(" \\+ ");

                int num1 = Integer.parseInt(arr2[0]);
                int num2 = Integer.parseInt(arr2[1]);

                if(num1 + num2 == Integer.parseInt(arr[1])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

        }
        return answer;
    }
}