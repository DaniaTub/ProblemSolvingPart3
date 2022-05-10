package ProblemSolving;

public class Seven
{
    public int removeDuplicates(int[] nums)
    {
        int size=nums.length;
        int count=0;
        for(int i=0;i<size-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[count++]=nums[i];
            }
        }
        nums[count++]=nums[size-1];
        return count;
    }



}
