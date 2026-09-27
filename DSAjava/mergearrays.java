/*
Approach:
Time Complexity: O(m+n)
Space Complexity: O(m)
1. Firstly, in order to not work on the data itself, I substituted the first m elements of the array of nums1 array to a new array variable, nums3 of size m.
2. In order to account for the indices of all the three arrays, i used variables i,j,k to keep track of it.
3. In the first while loop, The condition checks the elements one by one on both the arrays individually, which is only possible due to the already sorted scenario.
4. In conditions where one array is completely traversed, the next while loop condition ensures that the remaining elements of the other array are stored as it is in ascending order.



*/










class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for(int i=0;i<m;i++)
            nums3[i]=nums1[i];
        int i=0,j=0,k=0; //k indicates the indices of nums1.
        while(i<m && j<n){
            if(nums3[i]<=nums2[j])
                nums1[k++]=nums3[i++];
            else
                nums1[k++]=nums2[j++];
        }
        if(i<m || j<n){
            if(i<m){
                while(i<m)
                    nums1[k++]=nums3[i++];
            }
            else{
                while(j<n)
                    nums1[k++]=nums2[j++];
            }
        }
    }
}
