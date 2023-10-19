class Solution {
    public int maximizeSum(int[] nums, int k) {
      int sum=0;
	int big=nums[0];
	for(int i=1;i<nums.length;i++) {
		if(nums[i]>big)
			big=nums[i];
	}
	for(int i=1;i<=k;i++) {
		sum=sum+big;
		big=big+1;
	}
    return sum;
    }
}