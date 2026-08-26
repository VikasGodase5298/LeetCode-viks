/*  import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int index = 0;
        for(int number : set){
            nums[index] = number;
            index++;
        }
        return index;
    }
}  */   //TC = O(n) + n log(n)

//Optimal Approach two pointer
class Solution {
    public int removeDuplicates(int nums[]){
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

//TC = O(n)
//SC = O(1)