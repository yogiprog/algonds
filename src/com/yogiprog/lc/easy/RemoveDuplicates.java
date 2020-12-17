package com.yogiprog.lc.easy;

public class RemoveDuplicates {
	
	
	
	public static void main(String[] args) {
	
		int[] nums = {0,0,1,1,1,2,2,3,3,4,4,5};
		
		for(int i = 0 ; i<nums.length-1;i++) {
			
			if((nums[i]>=nums[i+1] )) {
				int j= i;
				while(nums[i]>=nums[j] && j<nums.length-1)
					j++;
		
				if(j==nums.length-1) {
			
					System.out.println(">>"+i);
					i = j;
				
				}
				else	
				nums[i+1]= nums[j];
				
			}
		}		
		
		for(int i : nums)
			System.out.println(i);
		
	}

}
