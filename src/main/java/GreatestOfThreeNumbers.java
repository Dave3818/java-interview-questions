public class GreatestOfThreeNumbers {

    public static void main (String[] args){
        int x = 111;
        int y = 110;
        int z = 111;

        String str;


        if (x>=y && x>=z)
        {
            System.out.println("X is greatest Number");
            if (x==y){
                System.out.println("Y is also greatest Number");}
            if (x==z){
                System.out.println("Z is also greatest Number");

        }
        }
        else if(y>=z){
            System.out.println("Y is greatest Number");
            if (y==z){
                System.out.println("Z is also greatest Number");}
            }
        else{
        System.out.println("z is greatest Number");
        }


    }

}
