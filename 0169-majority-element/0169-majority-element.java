class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int el=0;

        for(int i=0;i<n;i++){
            if(count==0){
                count++;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(el==nums[i]){
                count1++;
            }
        }
        if(count1>(n/2)){
            return el;
        }
        else{
            return -1;
        }
    }
}