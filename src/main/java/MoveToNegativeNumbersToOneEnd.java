import java.util.Arrays;

public class MoveToNegativeNumbersToOneEnd {

    public static void main (String[] args){

        int negArray[] = {-12, 2, -9, -8, 3,4,6,-1, -111};
        int j = 0;
        int temp;
        Arrays.sort(negArray);

        for ( int i = 0 ; i < negArray.length; i++){
              if(negArray[i] < 0){
                if (i != j){
                    temp = negArray[i];
                    negArray[i] = negArray[j];
                    negArray[j] = temp;
                }
                j++;
            }
        }
    for (int k : negArray){
        System.out.println(k);
    }
    }

}
