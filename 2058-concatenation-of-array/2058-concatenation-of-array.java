class Solution {
	int nums[]= {1,2,3,4,5};
    public int[] getConcatenation(int[] nums) {
			int ans[]=new int[2*nums.length];
		for(int i=0;i<2*nums.length;i++) {
			if(i<nums.length) {
		ans[i]=nums[i];	
		}
			else 
				ans[i]=nums[i-nums.length];
		}
		System.out.println("concatenated array is"+Arrays.toString(ans)); 
		return ans;
		}    
    }
