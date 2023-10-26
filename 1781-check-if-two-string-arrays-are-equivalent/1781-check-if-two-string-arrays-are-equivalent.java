class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
String result="",result1="";
    for(int i=0;i<word1.length;i++) {
    	result=result.concat(word1[i]);
    }
    for(int i=0;i<word2.length;i++) {
    	result1=result1.concat(word2[i]);
    }
    if(result1.equals(result))
    return true;
    return false;
    }
}