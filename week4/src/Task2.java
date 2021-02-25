import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int len=s.length();
        OUT:
        for (int i = 0; i < len; i++) {
            char a=s.charAt(i);
            for (int j = i+1; j <len; j++) {
                char b=s.charAt(j);
                if(a==b){
                    System.out.println(s.indexOf(a)-1);
                    break OUT;
                }
            }
        }

    }
}
