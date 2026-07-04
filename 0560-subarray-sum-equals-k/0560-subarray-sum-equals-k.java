class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        int prefixSum=0;
        int count=0;

        map.put(0,1);
        
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];

            int remove=prefixSum-k;

            if(map.containsKey(remove)){
                count+=map.get(remove);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}