/*
Approach
Time Complexity: O(n)
Space Complexity: O(n)
1. Created an array of equal size within the given class, which stores the cumulative sum of its previous elements.
2. In the sumRange function, simply return the cumulative sum of right incase left is zero, or the difference between the right indice and (left-1) indice for returning the sum
3. This way, there is no need to traverse the array, thus being efficient at generating the sum between left and right.

*/

class NumArray {
    int[] a;
    public NumArray(int[] nums) {
        a=new int[nums.length];
        int b=0;
        for(int i=0;i<nums.length;i++){
            a[i]=b+nums[i];
            b+=nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
            return a[right];
        return a[right]-a[left-1];
    }
}