import java.util.Iterator;

public class ParenthesisValid {

    public static void main (String[] args){
        ParenthesisValid parenthesisValid = new ParenthesisValid();
        System.out.println(parenthesisValid.isValid("(({}}{"));


    }

    public boolean isValid(String s) {
        boolean flag = false;
        char[] charArray = s.toCharArray();

        for ( int i =0; i < charArray.length;i++) {
                if(charArray.length -1== i){
                    break;
                }
            if (charArray.length >= 2){
                if(charArray[i] =='(' && charArray[i+1]==')'){
                    flag = true;
                }
                if(charArray[i]=='['&& charArray[i+1] ==']'){
                    flag = true;
                }
                if(charArray[i]=='{'&& charArray[i+1] =='}'){
                    flag= true;
                }
            }

        }
        return flag;
    }

}
