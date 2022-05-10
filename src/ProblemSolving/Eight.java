package ProblemSolving;
//Search Insert Position
public class Eight {
    public int searchInsert(int[] nums, int target) {
        //{
//    int m=0;
//        for (int i = 0; i <nums.length ; i++)
//        {
//            if(nums[i]==target)
//            {
//                m=i;
//            }
//            else {
//                for (int j =0; j <nums.length ; j++)
//                {
//                    if (nums[j]==target-1 || nums[j]==target-2) {
//                        m=j+1;
//
//                    }
//                }
//            }
//        }
//        return  m;
//    }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}