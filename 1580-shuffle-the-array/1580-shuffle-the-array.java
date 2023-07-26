class Solution {
	int nums[]= {2,5,1,3,4,7};
		int n=nums.length/2;
    public int[] shuffle(int[] nums, int n) {
     int x[]=new int[n];
		int y[]=new int[n];
		ArrayList<Integer> res=new ArrayList<>();
		System.arraycopy(nums, 0, x, 0, n);
		System.arraycopy(nums, n, y, 0, n);
		for(int i=0;i<n;i++) {
		res.add(x[i]);
		res.add(y[i]);
		}
		int res1[]=new int[res.size()];
	
	for(int l=0;l<res1.length;l++){
		res1[l]=res.get(l);	
	}
	
return res1;    
}

}