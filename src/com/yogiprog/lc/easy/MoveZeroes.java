package com.yogiprog.lc.easy;

public class MoveZeroes {
	
	
    public static void main(String[] args) {
		
    	//int [] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
    	int [] arr = {0, 1, 0, 3, 12};  
    	int n = arr.length;
    	 
    	 int count = 0;
    	 for (int i = 0; i < n; i++) 
             if (arr[i] != 0) {
            	
            	 System.out.println(">>>1-"+count);
            	 
                 arr[count++] = arr[i];
             
                 System.out.println(">>>2-"+count);
             }
    	 
    	 while (count < n) 
             arr[count++] = 0; 
    	
    	for (int i : arr) {
			
    		System.out.println(i);
		}
    	
    	
    	
	}

}
