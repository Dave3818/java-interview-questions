public class OccurenceOfAnElement {

    public static void main (String[] args){
        int[] intArray = new int[] {5,6,4,9,1,2,4,3,4,4,4};
        int freq =4;
        int count =0;
        for (int i =0;i< intArray.length;i++){
            if (intArray[i] == freq){
                count++;
            }
        }
        System.out.println("Frequency of 4: "+ count);
    }


}
