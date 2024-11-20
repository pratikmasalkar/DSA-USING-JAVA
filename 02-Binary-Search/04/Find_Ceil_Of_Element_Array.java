public class Find_Ceil_Of_Element_Array {

    public static int findElement(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 6, 7 };
        int target = 5;
        System.out.println("Element ceil is: " + findElement(nums, target));
    }
}
