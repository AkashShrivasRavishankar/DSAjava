/*
Approach:
Time Complexity: O(n)
Extra Space Complexity: O(1)

1.Since no division operators or nested loops can be used, the approach is individually finding the prefix products and suffix products and multiplying them with each other.
2.In this code, prefix products was found first by initializing the first element of the ans array as 1 for ease of multiplication.
3. A suffix variable was created to formulate the suffix products, running from the back of the array.
4. Using 2 for loops, the Time complexity is O(n)

*/




class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length,s=1;
        int[] a = new int[l];
        a[0]=1;
        for(int i=1;i<l;i++)
            a[i]=a[i-1]*nums[i-1];
        for(int i=l-1;i>=0;i--){
            a[i]*=s;
            s*=nums[i];
        }
        return a;
        
    }
}
