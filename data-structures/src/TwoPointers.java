public class TwoPointers {
    //Time Complexity - O(n)
    //Space Complexity - O(1)

    public static void main(String [] args){
        int[] arr = new int[]{2, 4, 3, 6, 7, 8, 9, 10};
        int target = 13;

        twoPointers(arr,target);
    }

    public static void twoPointers(int [] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println("target: " + sum);
                System.out.println("target found at indexes : " + left + " " + right);
                break;
            }
            else if(sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
    }
}