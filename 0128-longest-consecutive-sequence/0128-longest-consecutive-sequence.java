class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        if(n==0) return 0;

        int sequence=1;

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int it:set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;

                while(set.contains(x+1)){
                    x=x+1;
                    count+=1;
                }
                sequence=Math.max(sequence,count);
            }
        }
        return sequence;
    }
}