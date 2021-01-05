
public class recursionlmao
{
	public static boolean groupSum(int start, int[] nums, int target) {
		  if (start == nums.length)
		  {
		      if (target == 0)
		      {
		        return true;
		      }
		      else{
		        return false;
		      }
		  }
		  
		  
		  else{
		    return groupSum(start + 1, nums, target - nums[start]) ;

		  
		}
		}
	public static void main(String[] args)
	{
		int[] n1 = {2,4,8};
		System.out.println(groupSum(0,n1,10));
	}

}
