class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>temp = ncr(i);
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer>ncr(int n){
        int res = 1;
        List<Integer>temp = new ArrayList<>();
        temp.add(res);
        for(int i=1;i<n; i++){
            res = res * (n-i)/i;
            temp.add(res);
        }
        return temp;
    }
}