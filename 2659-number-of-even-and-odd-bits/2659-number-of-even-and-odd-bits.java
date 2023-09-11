class Solution {
    public int[] evenOddBit(int n) {
        int temp=0;
	int a[]=new int[2];
	a[0]=0;
	a[1]=0;
	ArrayList<Integer> arr=new ArrayList<Integer>();
	while(n>0) {
		temp=n%2;
		n=n/2;
		arr.add(temp);
	}
	for(int i=arr.size()-1;i>=0;i--) {
		if(i%2==0) {
		if(arr.get(i) ==1){
			a[0]=a[0]+1;
		}
		}
		else {
			if(arr.get(i) ==1){
				a[1]=a[1]+1;
			}
		}	
	}
    return a;
    }
}