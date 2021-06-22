public class TeladocFormatPhoneNum {

    public String solution(String S) {

        char[] phoneUnFormat = S.toCharArray();
        String str = "";
        for (char x : phoneUnFormat){
            if (Character.isDigit(x)){
                str = str + x;
            }
        }

        char[] phoneFormat = str.toCharArray();
        int index = str.length()/3;
        int i = 0;
        StringBuilder sb = new StringBuilder(str);
        while (i < str.length()){
            if (!(i+3 > str.length())){
            sb.insert(i+3,"-");}
            i = i +4;
        }
        str = sb.toString();
        System.out.println(index);
       // write your code in Java SE 8

    return sb.toString();
    }

    public static void main(String[] args){
        TeladocFormatPhoneNum solutionCO = new TeladocFormatPhoneNum();
        System.out.println(solutionCO.solution("555372654"));

    }
}
