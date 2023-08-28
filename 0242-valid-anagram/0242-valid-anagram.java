class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> arr=new ArrayList<Character>();
		ArrayList<Character> arr1=new ArrayList<Character>();
        for(int i=0;i<s.length();i++) {
			arr.add(s.charAt(i));	
		}
		Collections.sort(arr);
		System.out.println(arr);
		for(int j=0;j<t.length();j++) {
			arr1.add(t.charAt(j));
		}
		Collections.sort(arr1);
		System.out.println(arr1);
		if(arr.equals(arr1)) {
			return true;
		}
		else {
			return false;
    }
}
}