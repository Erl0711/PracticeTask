package org.practice.tasks.zhyldyz;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1};
        int[] arr2 = {5,7,5};
        int[] arr3 = {5,7,6};


        System.out.println(sameFirstLast(arr));
        System.out.println(sameFirstLast(arr2));
        System.out.println(firstLast6(arr3));
        System.out.println(commonEnd(arr, arr2));
        System.out.println(sum3(arr2));
        System.out.println(java.util.Arrays.toString(rotateLeft3(arr3)));
        System.out.println(java.util.Arrays.toString(fizzArray(6)));
    }


    public static boolean sameFirstLast(int[] nums) {
        if(nums.length<1) return false;
        if( nums[0]==nums[nums.length-1]) return true;
        return false;

    }
    public static boolean firstLast6(int[] nums) {
        if(nums[0]==6||nums[nums.length-1]==6) return true;
        return false;
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0]||a[a.length-1]==b[b.length-1]) return true;
        return false;
    }
    public static int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }
    public static int[] rotateLeft3(int[] nums) {
        int[] nums2 = new int[3];
        nums2[0]=nums[1];
        nums2[1]=nums[2];
        nums2[2]=nums[0];
        return nums2;
    }
    public static int[] fizzArray(int n) {
        int [] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i]=i;
        } return arr;
    }


}
