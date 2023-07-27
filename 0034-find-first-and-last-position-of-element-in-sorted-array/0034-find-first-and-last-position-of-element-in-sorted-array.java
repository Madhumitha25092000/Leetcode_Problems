class Solution {
    public int[] searchRange(int[] nums, int target) {
		 int ans[]= {-1,-1};
		 int start=search(nums,target,true);
		 int end=search(nums,target,false);
		 ans[0]=start;
		 ans[1]=end;
		 System.out.println(Arrays.toString(ans));
		 return ans;
	 }
	 static int search(int nums[],int target,boolean firstStart) {
		 int ans=-1;
		 int start=0;
			int end=nums.length-1;
			while(start<=end){
				int mid=(start+end)/2;
				if(nums[mid]==target) {
					ans=mid;
					if(firstStart==true) {
						end=mid-1;
					}
					else {
						start=mid+1;
					}}
				else if(nums[mid]<target)
					start=mid+1;
				else
					end=mid-1;
			}
		return ans;
}
	 }

