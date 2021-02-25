import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int[]nums=new int[a];
        for (int i = 0;i<nums.length; i++) {
            nums[i]=in.nextInt();
        }
       int k= in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                    if(nums[i]>nums[j]){
                        int temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                    }
            }
        }
        System.out.println(nums[k-1]);
    }
}
