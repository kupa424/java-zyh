import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        char[]s2=s.toCharArray();
        LinkedHashSet<Character> rs=new LinkedHashSet<>();
        for(char i : s2) {
            rs.add(i);
        }
        for (Character  c: rs) {
            System.out.print(c);

        }
    }
}
