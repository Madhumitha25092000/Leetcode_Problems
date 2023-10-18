class Solution {
    public int passThePillow(int n, int time) {
        int temp = 0;
		boolean flag=false,f=false;
		while(flag!=true) {
			if(f==false) {
		for(int i=1;i<n;i++) {
			temp=temp+1;
			if(temp==time) {
				flag=true;
				return i+1;
			}
		}
		f=true;
		}
			if(f==true) {
			for(int i=n;i>1;i--) {
				temp=temp+1;
				if(temp==time) {
					flag=true;
			    	return i-1;
			}
		}
		f=false;
	}
		}
		return -1;
    }
}