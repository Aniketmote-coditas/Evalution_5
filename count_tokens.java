package Weekly_evalution_5;

import java.util.StringTokenizer;

public class count_tokens {
    public void display(String str){
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        if(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.countTokens());
        }
    }
}
