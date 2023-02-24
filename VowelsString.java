package Weekly_evalution_5;

public class VowelsString {
    public void display(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                s += Character.toString(x);
            }
        }
        System.out.println(s);
    }
}
