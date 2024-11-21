
public class Find_first_last_occurence {

    public static int[] findElement(int arr[], int target) {
        int ans[] = { -1, -1 };
        ans[0] = findOccurence(arr, target, true);
        ans[1] = findOccurence(arr, target, false);

        return ans;
    }

    public static int findOccurence(int arr[], int target, boolean findFirstOcc) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstOcc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 2, 2, 4, 5,6 };
        int target = 2;
        int ans[]=findElement(nums, target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
