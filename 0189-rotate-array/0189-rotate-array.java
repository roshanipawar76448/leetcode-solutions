class Solution {
    public void rotate(int[] nums, int k) {//[1,2,3,4,5,6,7]
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);//reverse the entire array
        reverse(nums,0,k-1);//revese the first k element
        reverse(nums,k,n-1);//reverse the 
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}