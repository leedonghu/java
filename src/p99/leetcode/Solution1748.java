package p99.leetcode;

public class Solution1748 {
	 public int sumOfUnique(int[] nums) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        int result =0;
	        for(Integer s : nums){
	           if(set1.contains(s)){
	               set2.remove(s);
	           }else{
	               set1.add(s);
	           set2.add(s);
	           }
	            
	            
	           
	            
	        }
	        for(int n : set2){
	            result += n;
	            
	        }
	        return result ;
	    }
}
