class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Step 1: go up
        while(i + 1 < n && arr[i] < arr[i + 1]){
            i++;
        }

        // Step 2: peak cannot be first or last
        if(i == 0 || i == n - 1){
            return false;
        }

        // Step 3: go down
        while(i + 1 < n && arr[i] > arr[i + 1]){
            i++;
        }

        // Step 4: must reach end
        return i == n - 1;
    }
}