public class BinarySearchIteratively {
    public static void main(String[] args) {
        //Time Complexity - O(log n)
        //Space Complexity - O(1)

        int[] arr = new int[]{2, 3, 4, 10, 40, 55, 89, 100, 234};
        int target = 40;

        int result = binarySearchIterative(arr,target);
        if(result != -1){
            System.out.println("Target found at index : " + result);
        }
        else System.out.println("Target not found in array");
    }

    public static int binarySearchIterative(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}