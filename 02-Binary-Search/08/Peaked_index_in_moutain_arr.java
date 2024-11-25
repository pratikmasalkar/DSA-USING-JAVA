public class Peaked_index_in_moutain_arr {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 5, 2 };
         System.out.println(findPeakIndex(arr));
    }

    public static int findPeakIndex(int arr[]) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
