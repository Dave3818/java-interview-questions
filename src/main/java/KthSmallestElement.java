import java.util.Arrays;

public class KthSmallestElement {
    public static void main (String[] args){
        int[] intArray = new int[] {5,6,4,9,1,2};
        int k =3;
        Arrays.sort(intArray);
        System.out.println(intArray[k-1]);
    }

}
