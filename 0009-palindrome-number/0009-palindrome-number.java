class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rem=0,sum=0;
		while(temp!=0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(sum>=0) {
		if(sum==x) {
			return true;
		}
		}
		else {
			return false;
		}
		return false;
    }
}