package hw_3;

//1) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class hw_3_1 {
    public static void mergeSort (int[] arr, int left, int right){
        if (right<=left) return;
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] leftArr = new int[mid + 1 - left];
        int[] rightArr = new int[right - mid];
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[i + left];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[i + mid + 1];
        }
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < leftArr.length & rightIndex < rightArr.length){
                if (leftArr[leftIndex] < rightArr[rightIndex]){
                    arr[i] = leftArr[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArr[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArr.length) {
                arr[i] = leftArr[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArr.length) {
                arr[i] = rightArr[rightIndex];
                rightIndex++;
            }

        }
    }

    public static void main(String[] args){
        int[] array = new int[]{1,3,4,1,3,5,234,6,3,42,5};
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
