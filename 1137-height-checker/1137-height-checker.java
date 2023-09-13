class Solution {
    public int heightChecker(int[] heights) {
       int count=0;
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(int i=0;i<heights.length;i++) {
		arr.add(heights[i]);
	}
	Arrays.sort(heights);
	for(int i=0;i<arr.size();i++) {
	if(heights[i]!=arr.get(i)) 
		count=count+1;
}
	return count; 
    }
}