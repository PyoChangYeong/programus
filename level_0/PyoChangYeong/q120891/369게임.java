class Solution {
    public int solution(int order) {
        int answer = 0;
        String result = ""+order;
        for (int i = 0; i < result.length(); i++) {
            char temp = result.charAt(i);
            if(temp == '3' || temp == '6' || temp == '9'){
                answer++;
            }
        }
        return answer;
    }
}