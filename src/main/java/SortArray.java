public class SortArray {

    public static void main (String[] args){
        int[] intArray = new int[] {-12, 2, -9, -8, 3,4,6,-1, -111};
        int temp;
        for (int n= 0; n <intArray.length; n++){
            for (int m = n +1; m < intArray.length; m++){
                if (intArray[n] > intArray[m]){
                    temp = intArray[m];
                    intArray[m] = intArray[n];
                    intArray[n] = temp;
                }
            }
        }
        for (int n=0; n <intArray.length; n++){
        System.out.println(intArray[n]);}
    }

}
