import java.util.*;

public class SmallestPositiveNumberInArray {


        public int solution(int[] A) {

            Boolean result = true;
            List<Integer> intList = new ArrayList<Integer>(A.length);
            for (int i : A)
            {
                intList.add(i);
            }
            int max = Arrays.stream(A).max().getAsInt();
            int minArray = Arrays.stream(A).min().getAsInt();
            Set<Integer> newSet = new HashSet<>();
            if (max < 0 ) {
                newSet.add(1);
                 }
            else {
            for ( int i = 1 ; i < max ; i ++){

                if ( !intList.contains(i)){
                    result = false;}


               if (!intList.contains(max-i)){
                   newSet.add(max-i);
               }

            }}
            if (result != null && result == true){
                if (max >0){
                newSet.add(max+1);}
            }
            int min = Collections.min(newSet);
            System.out.println("Minimum is : " + min);
            return min;


            // write your code in Java SE 8

    }

    public static void main (String[] args){
            SmallestPositiveNumberInArray testJava = new SmallestPositiveNumberInArray();
            testJava.solution(new int[]{1, 3, 4 });
    }

}
