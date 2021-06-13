public class FindMinandMax {

    public static void main (String[] args){
    int[] intArray = new int[] {5,6,4,9,1,2};
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
        int resMin=intArray[0];
        int resMax = intArray[0];
        for (int n= 0; n <intArray.length; n++){
            resMin = Math.min(resMin,intArray[n]);
            resMax = Math.max(resMax, intArray[n]);
        }



        System.out.println("Minimum" +intArray[0]);
        System.out.println("Maximum" +intArray[intArray.length-1]);


        System.out.println("Minimum" +resMin);
        System.out.println("Maximum" +resMax);
}

}
