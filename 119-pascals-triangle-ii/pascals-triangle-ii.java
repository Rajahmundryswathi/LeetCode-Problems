class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;
        List<Integer>ans = new ArrayList<>();
        long res = 1;
        ans.add(1);
        n = n+1;
        for(int i=1; i<n; i++){
            res = res*(n-i);
            res = res/i;
            ans.add((int)res);
        }
        return ans;
    }
}