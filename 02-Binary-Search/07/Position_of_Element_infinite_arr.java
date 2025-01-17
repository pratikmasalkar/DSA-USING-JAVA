public class Position_of_Element_infinite_arr {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 10, 34, 56, 88, 111, 140, 160, 187 ,200,234,400,405};
        System.out.println(ans(arr, 88));
    }

    public static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
