class Solution {
    public int addDigits(int num) {
			int temp=0,sum=0;
        while(num!=0) {
		temp=num%10;
		sum=sum+temp;
		num=num/10;
	}
	while(sum>=10) {
	sum=fun(sum);
}
return sum;
		}
		static int fun(int sum) {
		int temp=0,sums=0;
	while(sum!=0) {
		temp=sum%10;
		sums=sums+temp;
		sum=sum/10;
	}
	sum=sums;
	return sum;

}
}