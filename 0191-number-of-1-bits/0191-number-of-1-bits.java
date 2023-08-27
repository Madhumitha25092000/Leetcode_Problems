public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String n1=Integer.toBinaryString(n);
		int count=0;
		for(int i=0;i<n1.length();i++) {
			if(n1.charAt(i)=='1') {
				count =count+1;
			}
		}
		System.out.println(count);
        return count;
    }
}