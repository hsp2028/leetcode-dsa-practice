class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxE = 0;
        
        // Find the maximum pile size (upper bound)
        for (int pile : piles) {
            if (pile > maxE) {
                maxE = pile;
            }
        }
        
        int i = 1, j = maxE;
        int ans = maxE;
        
        // Inlined binary search to remove method call overhead
        while (i <= j) {
            int mid = i + (j - i) / 2;
            long count = 0;
            boolean possible = true;
            
            for (int pile : piles) {
                count += ((long) pile + mid - 1) / mid;
                if (count > h) {
                    possible = false;
                    break; // Early exit: current speed 'mid' is too slow
                }
            }
            
            if (possible) {
                ans = mid;
                j = mid - 1; // Try to find a smaller speed
            } else {
                i = mid + 1; // Speed is too slow, increase it
            }
        }
        return ans;
    }
}
