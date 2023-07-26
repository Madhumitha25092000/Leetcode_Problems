class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
     ArrayList<Integer> res= new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]>nums[j])
					count=count+1;
			}
			res.add(count); 
		}
System.out.println(res);
int res1[]=new int[nums.length];
for(int k=0;k<nums.length;k++) {
	res1[k]=res.get(k);
}
return res1;   
    }
}