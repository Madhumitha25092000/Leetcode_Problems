class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     int start=0;
		 int n=letters.length;
		int end=letters.length-1;
        if(target>letters[letters.length-1])
        return letters[0];
		while(start<=end) {
			int mid=(start+end)/2;
			if(letters[mid]<=target)
				start=mid+1;
			else
				end=mid-1;   
    }
    return letters[start%n];
}}