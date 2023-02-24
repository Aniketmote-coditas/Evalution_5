package Weekly_evalution_5;

public class NextLetter {
    public void display(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x!=' ') {
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    s += Character.toString(x);
                } else {
                    int c = (int) x;
                    char v = (char) (c + 1);
                    s += Character.toString(v);
                }
            }
        }
        System.out.println(s);
    }
}
