import java.util.HashMap;
import java.util.Map;

public class ArrayIndexSum {


    public static int[] sumIndexes(int[] arraySum, int target) {

        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int i = 0; i < arraySum.length; i++) {
            int otherValue = target - arraySum[i];
            for (int j = i + 1; j < arraySum.length; j++) {
                if (otherValue == arraySum[j]) {
                    return new int[]{arraySum[i], arraySum[j]};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public static void main (String[] args){

        int [] arraySum = {3, 3, 2, 4, 1};
        int target = 5;
        int[] result = sumIndexes(arraySum,target );
        for ( int i : result){
        System.out.println(i);}

    }


}
