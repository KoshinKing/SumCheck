import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner word=new Scanner(System.in);
        int[]nums = {1,3,5,6,8,9,11,24,100};
        System.out.println("Enter the number target: ");
        System.out.println(sumChecker(nums,word.nextInt()));
    }
    public static String sumChecker(int[] nums,int targ)   {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==targ){
                    return "The two indexes in which add up to the target value are: " +i +" and " +j;
                }
            }
        }
        return "no.";
    }
}