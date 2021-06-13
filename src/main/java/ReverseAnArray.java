public class ReverseAnArray {
    public static void main (String[] args)   {

        int [] array = {1,3,2,4,9,3,1,7,3,11,12,3};
        int arrayLength = array.length;
        int temp =0;
        int i =0;
        while (i<arrayLength-1)
       {    temp = array[i];
            array[i] = array[arrayLength-1];
            array[arrayLength-1] = temp;
            i++;
            arrayLength--;
       }
        for (int n = 0; n <array.length; n++){
            System.out.println(array[n]);
        }
    }

}
