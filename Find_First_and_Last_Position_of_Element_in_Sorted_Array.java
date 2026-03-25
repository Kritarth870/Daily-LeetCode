class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};

        // first position 
        int low = 0 , high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                if(mid > 0 && nums[mid] == nums[mid-1]){
                    high = mid-1;
                }else{
                    arr[0] = mid;
                    break;
                }
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        // Last position 

        low = 0 ; high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                if(mid+1<nums.length && nums[mid] == nums[mid+1] ){
                    low = mid+1;
                }else{
                    arr[1] = mid;
                    break;
                }
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return arr;
    }
}
