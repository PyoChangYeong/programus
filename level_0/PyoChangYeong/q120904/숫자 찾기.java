class Solution {
    public int solution(int num, int k) {
          String num1 = Integer.toString(num);
        String k1 = Integer.toString(k);
        if(num1.indexOf(k1) == -1) {
            return -1;
        }else{
            return num1.indexOf(k1)+1;
    }
}
}