/**
 * 典型二分查找法，若最後找不到則low為應該插入的點，回傳low。
 * @author black
 *
 */
public class Solution {
	public int searchInsert(int[] nums, int target) {
			if(nums==null) return 1;
			int high = nums.length-1;
			int low = 0;
			while(low<=high)
			{
				int mid = (high+low) / 2;
				if(target<nums[mid])
				{
					high = mid -1;
				}
				else if(target>nums[mid])
				{
					low = mid+1;
				}
				else
					return mid;
			}
			return low;
    }
}
