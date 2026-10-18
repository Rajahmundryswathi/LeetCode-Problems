class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,List<Integer>>hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i], new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
        }
        
        for(List<Integer>ls : hm.values()){
            for(int i = 1; i<ls.size(); i++){
                int d = ls.get(i) - ls.get(i-1);
                if(d<=k){
                    return true;
                }
            }
        }
        return false;
    }
}