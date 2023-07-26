class Solution {
    public int largestAltitude(int[] gain) {
     int res[]=new int[gain.length+1];
		res[0]=0;
		for(int i=1;i<res.length;i++) {
			if(i==1)
				res[i]=gain[i-1];
			else
				res[i]=gain[i-1]+res[i-1];
		}
		Arrays.sort(res);
		int res1=res[res.length-1];
		return res1;   
    }
}