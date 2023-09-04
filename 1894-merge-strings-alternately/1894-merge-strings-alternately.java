class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word3="";
        boolean flag=false;
	if(word1.length()>word2.length())
		flag=true;
	if(flag==true) {
		for(int i=0;i<word2.length();i++){
			word3=word3+word1.charAt(i);
			word3=word3+word2.charAt(i);
		}
		for(int i=word2.length();i<word1.length();i++) {
			word3=word3+word1.charAt(i);
		}
	}
	else {
		for(int i=0;i<word1.length();i++){
			word3=word3+word1.charAt(i);
			word3=word3+word2.charAt(i);
		}
		for(int i=word1.length();i<word2.length();i++) {
			word3=word3+word2.charAt(i);
		}
	}
	return word3;
    }
}