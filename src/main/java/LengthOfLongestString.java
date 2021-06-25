import java.util.*;

public class LengthOfLongestString {

    public int lengthOfLongestSubstring(String s) {
            int max = 0;
            char[] stringArray = s.toCharArray();
            if (s.isBlank() || s.length()==1){
                if(!s.isEmpty()){
                max = 1;}
             }else{
            ArrayList<Character> longestString = new ArrayList<>();
            ArrayList<Integer> length = new ArrayList<>();
                 for (char ch : stringArray) {
                    if (longestString.contains(ch)) {
                        length.add(longestString.size());
                        int size = longestString.indexOf(ch);
                        for (int i = 0; i <=size; i++){
                            longestString.remove(0);
                        }
                    }
                    longestString.add(ch);
                }
                length.add(longestString.size());
                max = Collections.max(length);
   }
         return max;
    }

    public static void main(String[] args){
        LengthOfLongestString lengthOfLongestString = new LengthOfLongestString();
        System.out.println(lengthOfLongestString.lengthOfLongestSubstring("abcabcbb"));
    }


}
