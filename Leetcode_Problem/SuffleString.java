public class SuffleString {
    public static void main(String[] args){
        String s = "code";
        int[] indices = {3, 1, 2, 0};

        String output = restoreString(s, indices);
        System.out.println("Suffle String: " + output);
    }

    public static String restoreString(String s, int[] indices){
        char[] result = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

}
