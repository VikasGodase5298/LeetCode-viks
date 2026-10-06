class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num == 1){
            return false;
        }
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                sum += i;
            if(i !=  num/i  && num != num/i){
                sum += num/i;
                }
            }
        }
        if(num == sum){
            return true;
        }
        return false;
    }
}