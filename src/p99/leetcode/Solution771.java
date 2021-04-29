package p99.leetcode;

public class Solution771 {
	
	    public int numJewelsInStones(String jewels, String stones) {
	        Set<Character> jewelSet = new HashSet<>();
	        for(int i=0; i<jewels.length(); i++){
	            jewelSet.add(jewels.charAt(i));
	        }
	        int result = 0;
//	         Iterator<Character> iter = jewelSet.iterator();
//	         for(int i=0; i<jewelSet.size(); i++){
	            
//	             Character c = iter.next();
//	             for(int j=0; j<stones.length(); j++){
//	                 char s = stones.charAt(j);
//	                 if(c == s){
//	                     result++;
//	                 }
//	             }
//	         }
	        for(int i=0; i<stones.length(); i++){
	            if(jewelSet.contains(stones.charAt(i))){
	                result++;
	            }
	        }
	        return result;
	        
	    }
	
}
