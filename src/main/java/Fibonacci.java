import java.util.Arrays;

public class Fibonacci {

    public int[] getFibsFast(int pN) {
        if(pN == 1) { return new int [] { 0 }; }
        if(pN == 2) { return new int [] { 0, 1 }; }

        int [] fibs = new int [pN];
        fibs[0] = 0;
        fibs[1] = 1;

        for(int i=2; i<fibs.length; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs;
    }

    public static void main (String[] args){
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(Arrays.toString(fibonacci.getFibsFast(10)));
    }


}
