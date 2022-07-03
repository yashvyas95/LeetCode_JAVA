package com.LeetCode.Solutions.medianOfSortedArrays;

public class solution {

    public static double findMedian(int[] nums1, int[] nums2){
            if(nums1.length > nums2.length)
            {
                return findMedian(nums2,nums1);
            }

            int x = nums1.length;
            int y = nums2.length;

            int low = 0;
            int high = x;

            while(low<=high)
            {

                int partitionX = (low+high)/2;
                int partitionY = (x+y+1)/2 - partitionX;

                int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX-1];
                int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

                int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY-1];
                int minRightY = (partitionY==y) ? Integer.MAX_VALUE : nums2[partitionY];

                if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                        if((x+y)%2==0)
                        {
                            return (double)(Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
                        }
                        else
                            return (double)Math.max(maxLeftX,maxLeftY);
                }

                else if(maxLeftX > minRightY)
                {
                    high = partitionX-1;
                }
                else{
                    low = partitionX+1;
                }
            }

            throw new IllegalArgumentException();
    }


    public static void main(String[] args){
                int[] nums1 = new int[]{1,2,3,5,6};
                int[] nums2 = new int[]{4};

        System.out.println(findMedian(nums1,nums2));
    }
}
