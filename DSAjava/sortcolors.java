/*
Approach
Time Complexity: O(n)
Space Complexity: O(1)
1.Counted the occurrences of 0,1,2
2. Took j as the indices of the array to be modified
3. Successively set the values 0,1,2 at a,b,c number of times

*/

class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
               a++;
            else if(nums[i]==1)
               b++;
            else
               c++;
        }
        for(int i=0;i<a;i++)
           nums[j++]=0;
        for(int i=0;i<b;i++)
           nums[j++]=1;
        for(int i=0;i<c;i++)
           nums[j++]=2;
    }
}