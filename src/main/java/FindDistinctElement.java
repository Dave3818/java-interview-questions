import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDistinctElement {

    public static void main (String[] args) {
        Integer regularArray[] = {1,2,3,4,5,5,6,6,2,9,8,9};
        int distinctArray[] = new int[20];
        int duplicateArray[] = new int [10];

        int index = 0;
        int dupIndex =0;
        for (int i = 0; i <regularArray.length; i++){
            int flag =0;
            for ( int j =0; j < i; j++) {
                if (regularArray[i] == regularArray[j]){
                    flag = 1;
                    break;
                }
            }
            if (flag ==0){
                distinctArray[index] =  regularArray[i];
                index++;
            }
        }
        for (int n=0; n < distinctArray.length; n++) {
            System.out.println(distinctArray[n]);
        }
        HashMap<Integer, Integer> UniqueValues = new HashMap<>();
        HashSet<Integer> UniqueSet = new HashSet<>();
        for (int i = 0; i <regularArray.length; i++){
            UniqueValues.put(regularArray[i],i);
            UniqueSet.add(regularArray[i]);
        }
        System.out.println(UniqueValues.keySet());
        for (Integer set : UniqueSet){
        System.out.println(set);
        }

        Set<Integer> UniqueStreamSet = new HashSet<>();
        Set<Integer> dupSet = Arrays.asList(regularArray)
                                    .stream().filter(k ->  !UniqueStreamSet.add(k))
                                    .collect(Collectors.toSet());
        System.out.println("Duplicates "+ dupSet);
        dupSet.forEach(System.out :: println);

        for (int i = 0; i <regularArray.length; i++){
            int dupFlag =0;
            for ( int j =i+1; j < regularArray.length; j++) {
                if (regularArray[i] == regularArray[j]){
                    dupFlag = 1;
                    break;
                }
            }
            if (dupFlag ==1){
                duplicateArray[dupIndex] =  regularArray[i];
                dupIndex++;
            }
        }
        for (int n=0; n < duplicateArray.length; n++) {
            System.out.println("Duplicate Values :"+duplicateArray[n]);
        }


    }

}
