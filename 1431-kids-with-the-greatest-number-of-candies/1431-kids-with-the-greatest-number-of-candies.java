class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Find maximum
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max,candies[i]);
        }
        
        // Check each kid
        for(int i = 0; i < candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
}