import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution s=new Solution();
        System.out.println("请输入target：");
        int target=in.nextInt();
        System.out.println("请输入数组长度：");
        int arrayLength=in.nextInt();
        int[]nums=new int[arrayLength];
        System.out.println("请输入数组内容，以回车分割：");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(s.threeSum(nums,target));
    }

}
class Solution {
    public List<List<Integer>>threeSum(int[] nums, int t){
        List<List<Integer>>res=new ArrayList<>();
        int len=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len-2; i++) {
            if (nums[i]>t){
                break;}
            if (i>0&&nums[i]==nums[i-1]){
                continue; }
            int left=i+1;
            int right=len-1;
            while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum ==t){
                res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right&&nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right&&nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }
            else if(sum<t)left++;
            else if(sum>t)right--;
            }
        }
        return res;
    }
}
