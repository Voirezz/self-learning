public class BinarySearchIteratively {
    public static void main(String [] args){
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int target = 3;

        if(binarySearch(arr, target) == -1){
            System.out.println("Number not found");
        }
        else {
            System.out.println("Target Found : " + binarySearch(arr,target));
        }
    }

    public static int binarySearch(int [] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return target;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}