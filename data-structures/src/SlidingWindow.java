public class SlidingWindow {
    /* Find the max sum subarray of a fixed size K

       Example Input:
       [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
     */
    public static int findMaxSumArray(int [] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.length; i++){
            currentRunningSum += arr[i];


            if(i >= k - 1){
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= arr[i - (k - 1)];
            }
        }
        return maxValue;
    }
    public static void main(String [] args){
        System.out.println(findMaxSumArray(new int []{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));

    }
}
