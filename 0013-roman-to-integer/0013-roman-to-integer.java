class Solution {
    public int romanToInt(String s) {
         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	hm.put('I', 1);
	hm.put('V', 5);
	hm.put('X', 10);
	hm.put('L', 50);
	hm.put('C', 100);
	hm.put('D', 500);
	hm.put('M', 1000);
	int result=0,i=0;
	while(i<s.length()){
		Character ch=s.charAt(i);
		if(i<s.length()-1) {
		Character ch1=s.charAt(i+1);
			if(hm.get(ch)>=hm.get(ch1)) {
			result=result+hm.get(ch);
			i++;
			}
			else {
				result=(result+hm.get(ch1))-hm.get(ch);
				i+=2;
			}
		}
		else {
			result=result+hm.get(ch);
			i++;
	}
		}
	return result;
    }
}