import java.util.Arrays;

public class sortingandserching {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }


            if (arr[mid] < target) {
                left = mid + 1;
            }
    
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {34, 2, 8, 21, 41};
        
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));


        selectionSort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
        
        int targetElement = 21;
        int result = binarySearch(unsortedArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}

/////////////////////////////////////
//This code is written by znl_arad//
///////////////////////////////////