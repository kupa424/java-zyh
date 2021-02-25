import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len=in.nextInt();
        int[]nums=new int[len];
        System.out.println("请输入数组内容：");
        for (int i = 0; i < len; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(major(nums));

    }

    private static int major(int[] nums) {
        int temp=nums[0];
        int count=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) count++;
            else count--;
            if(count==0){
                temp=nums[i];
                count=1;
            }
        }
        int length=nums.length/2+1;
        count=0;
        for(int num:nums){
            if(num==temp)count++;
        }if(count==length) return temp;
        else return -1;
    }
}
