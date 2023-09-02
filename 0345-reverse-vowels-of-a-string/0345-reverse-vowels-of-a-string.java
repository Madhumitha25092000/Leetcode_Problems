class Solution {
    public String reverseVowels(String s) {
    ArrayList<Character> arr=new ArrayList<Character>();
	for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
		arr.add(s.charAt(i));
	}
}
	String a="";
	int t=1;
	for(int i=0;i<s.length();i++) {
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
//		if(j==arr1.get(j))	
	a=a+arr.get(arr.size()-t);
	t=t+1;
		}
else {
	a=a+s.charAt(i);
}
	}
	return a;
    }
}