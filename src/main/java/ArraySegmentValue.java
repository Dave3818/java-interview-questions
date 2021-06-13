public class ArraySegmentValue {

    public static void main (String [] args){

        int [] array = {1,3,2,4,9,3,1,7,3,11,12,3};
        int segment = 2;
        int value = 3;
        boolean result = false;
        int i;
        int j=0;
        for ( i = 0; i < array.length; i = i +segment){
                for (j = i; j < i+segment; j++){
                    if (j < array.length && array[j] == value){
                       // System.out.println("Segment :" + String.valueOf(i) + " Value :" + String.valueOf(value));
                        break;
                    }
                    if (j == i+segment-1 || j > array.length ){
                        result = false;
                    }

                }
        } if (j < array.length){
            result = true;
            }
        System.out.println(result);


    }


}
