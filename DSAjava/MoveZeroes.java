/*
Approach
Time Complexity: O(n)
Space Complexity: O(1)
1. Created a variable j to traverse the original array after counting non zeroes.
2. Whenever There is a non zero number, replace the elements of the array inplace with the help of j having initial value 0 and increment it.
3. Once done, fill the remaining digits of the array with 0s

*/

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
           if(nums[i]!=0)
              nums[j++]=nums[i]; 
        while(j<nums.length)
            nums[j++]=0;
    }
}