public class LongestSubstring {
    public static void main(String[] args){
        System.out.println(subString("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

        
    }
    public static int subString(String s){
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(visited[ch]){
                    break;
                }

                visited[ch] = true;
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    public static  int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];

        // Initialize all values to -1
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character already seen in current window
            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }

            lastIndex[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
