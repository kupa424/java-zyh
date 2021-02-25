import java.util.Scanner;
import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(isvaild(s));
    }

    private static boolean isvaild(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.empty()){
                return false;
            }
            char top=stack.pop();
            if(top=='('&&c==')'){
                continue;
            }
            if(top=='{'&&c=='}'){
                continue;
            }
            if(top=='['&&c==']'){
                continue;
            }
            return false;
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
