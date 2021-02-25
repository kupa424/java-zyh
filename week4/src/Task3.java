import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String num= in.next();
        String s1=null;
        String s2=null;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)=='.'){
                s1=num.substring(0,i);
                s2=num.substring(i+1);
                break;
            }
        }
        int len=s2.length();
        int c=(int)Math.pow(10,len);
        int a=Integer.parseInt(s1)*c+Integer.parseInt(s2);
        for (int i = 2; i < a; i++) {
            if((a%i==0)&&(c%i==0)){
                a=a/i;
                c=c/i;
                i=1;
            }
        }
        System.out.println(a+"/"+c);
    }
}
