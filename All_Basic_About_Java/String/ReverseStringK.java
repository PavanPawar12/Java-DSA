public class ReverseStringK {

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Process the string in steps of 2k characters
        for (int i = 0; i < n; i += 2 * k) {

            int start = i;
            int end = Math.min(i + k - 1, n - 1); 
            // end = reverse only first k chars, 
            // if remaining is less than k, reverse all remaining

            // Reverse the characters between start and end
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } 
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        // Example 1
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Output: " + reverseStr(s1, k1));

        // Example 2
        String s2 = "abcd";
        int k2 = 2;
        System.out.println("\nInput: " + s2 + ", k = " + k2);
        System.out.println("Output: " + reverseStr(s2, k2));
    }
}
