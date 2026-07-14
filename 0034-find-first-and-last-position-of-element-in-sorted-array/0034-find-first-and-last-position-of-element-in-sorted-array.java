class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);
        res[0]=left;
        res[1]=right;
        return res;
    }

    public int binarySearch(int[] nums,int target,boolean isSearchingLeft){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int index=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                index=mid;
                if(isSearchingLeft){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return index;
    }
}