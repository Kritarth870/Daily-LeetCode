class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o = m+n;

        int arr [] = new int[n+m];
        int k = 0;
        for(int i=0 ; i<m ; i++){
            arr[k] = nums1[i];
            k++;
        }

        for(int i=0 ; i<n ; i++){
            arr[k] = nums2[i];
            k++;
        }

        Arrays.sort(arr);

    
        if(o%2!=0){
            return (double) arr[o/2];
        }else{
            return (double)(arr[o/2] + arr[o/2-1]) /2 ;
        }


    }
}
