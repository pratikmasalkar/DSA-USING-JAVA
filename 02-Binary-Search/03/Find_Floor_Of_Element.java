class Find_Floor_Of_Element {
    public static int findElement(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5, 8, 10 };
        int target = 5;
        System.out.println("Element Floorof target is: " + findElement(nums, target));
    }
}