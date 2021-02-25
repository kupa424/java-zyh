import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str1 = in.nextLine();
        String s1=in.nextLine();
        int nums1=str1.indexOf(s1);
        System.out.println(nums1);
        String str2 = in.nextLine();
        String s2=in.nextLine();
        int nums2=str2.indexOf(s2);
        System.out.println(nums2);
    }
}
