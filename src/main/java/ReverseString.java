public class ReverseString {

    public static void main (String[] args){

        String str = "Selvachezhiyan Dinesh Rajarajan";
        char[] temp = str.toCharArray();
        int start = 0;
        int end = temp.length-1;
        char tempChar;
         while(start < end ){
             tempChar = temp[end];
             temp[end] = temp[start];
             temp[start] = tempChar;
             start++;
             end--;
         }
         System.out.println(temp);
         str = String.valueOf(temp);
         System.out.println(str);
    }

}
