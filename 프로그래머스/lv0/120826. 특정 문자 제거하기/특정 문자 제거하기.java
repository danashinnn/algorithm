class Solution {
    public String solution(String my_string, String letter) {
        if(my_string.contains(letter)) my_string = my_string.replaceAll(letter, "");
        return my_string;
    }
}