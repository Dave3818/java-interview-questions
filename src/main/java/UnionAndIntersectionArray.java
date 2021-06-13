import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionArray {

    public static void main (String args[]){

        int[] array1 = {4, 8, 9 , 10 , 23, 18, 19};
        int[] array2 = {7, 6, 5, 9, 23};
        Set<Integer> Union = new HashSet();
        Set<Integer> Intersection = new HashSet();
        int k = array2.length;


       for ( int i = 0; i < array2.length; i++) {
           Union.add(array2[i]);
       }
        for ( int i = 0; i < array1.length; i++) {
            if (Union.contains(array1[i])){
                Intersection.add(array1[i]);
            }
            Union.add(array1[i]);
        }

        System.out.println(Union);
        System.out.println(Intersection);
        for (int q : Union) {
            System.out.println(q);
        }

    }

}
