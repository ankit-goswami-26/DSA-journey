class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int money : accounts[i]){
                sum += money;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}