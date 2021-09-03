/*
Find First and Last Position of Element in Sorted Array
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2] ;
        Arrays.fill(res , -1) ;
        
        //Base Cases
        
        if(nums.length == 0)
            return res ;
        
        
        if(nums[0] > target)
            return res ;
        
        if(nums[nums.length - 1] < target)
            return res ;
        
        
        //find the first position of element
        
        int start = 0 ; 
        int end = nums.length - 1 ;
        
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(nums[mid] == target){
                res[0] = mid ;
                end = mid - 1 ;
            } else if(nums[mid] < target)
                start = mid + 1 ;
            else
                end = mid - 1 ;
        }
        
        if(res[0] == -1)
            return res ;
        
        start = 0 ; 
        end = nums.length - 1 ;
        
         while(start <= end){
            int mid = start + (end - start)/2 ;
            if(nums[mid] == target){
                res[1] = mid ;
                start = mid + 1 ;
            } else if(nums[mid] < target)
                start = mid + 1 ;public class 2 {
                    
                }
                
            else
                end = mid - 1 ;
        }
        
        return res ;
    }
}