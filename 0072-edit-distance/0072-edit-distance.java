class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // dp[i][j] stores the min operations to convert word1[0...i-1] to word2[0...j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Base cases:
        // Converting word1[0...i-1] to an empty string requires i deletions
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        // Converting an empty string to word2[0...j-1] requires j insertions
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], 
                                   Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        return dp[m][n];
    }
}