public class PrefixSum {
    public static void main(String [] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }

    public static int[] calculatePrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
