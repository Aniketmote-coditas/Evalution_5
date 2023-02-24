package Weekly_evalution_5;

import java.util.Scanner;

public class Q1_no_of_character {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("plzz Enter the string");
        String str = sc.nextLine();

        System.out.println("press 1 for count no of tokens");
        System.out.println("press 2 to get string of vowels");
        System.out.println("press 3 to get next leter of consonant");
        int n = sc.nextInt();

        count_tokens c = new count_tokens();
        VowelsString v = new VowelsString();
        NextLetter nn = new NextLetter();


        if(n==1){
            c.display(str);
        }else if(n==2){
            v.display(str);
        }else if(n==3){
            nn.display(str);
        }else{
            System.out.println("plzz enter from above options");
        }



    }
}
/*
plzz Enter the string
aniket nitin mote aniket
press 1 for count no of tokens
press 2 to get string of vowels
press 3 to get next leter of consonant
1
4
 */

/*
plzz Enter the string
aniet ntiin mote
press 1 for count no of tokens
press 2 to get string of vowels
press 3 to get next leter of consonant
2
aieiioe

 */

/*
plzz Enter the string
aniit nitin mote anitkrgn
press 1 for count no of tokens
press 2 to get string of vowels
press 3 to get next leter of consonant
3
aoiiuoiuionoueaoiulsho

 */
