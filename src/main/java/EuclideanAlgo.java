import java.util.WeakHashMap;

public class EuclideanAlgo {

    public int Solve(int total, int interval){

        return (total/Modulas(total,interval));

    }

    public int Modulas (int M, int N){
     if (M%N ==0)  {return N; }
     else return (Modulas(N,M%N));
    }


    public static void main (String[] args){
        EuclideanAlgo euclideanAlgo = new EuclideanAlgo();
        System.out.println(euclideanAlgo.Solve(10,4));

    }

}
