class Solution {
    public int missingNumber(int[] nums) {
    ArrayList<Integer> al=new ArrayList<Integer>();
		 ArrayList<Integer> al1=new ArrayList<Integer>();
	int n=nums.length;
	int temp=0;
	for(int i=0;i<n;i++) {
		al.add(nums[i]);
	}
	Collections.sort(al);
	System.out.println(al);
	for(int j=0;j<=n;j++) {
	if(al.contains(j)) {
		
	}
	else {
		al1.add(j);
		 temp=j;
    }
	}
	 return temp;
		}
}