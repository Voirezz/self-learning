public class SieveOfErathosthenes {
    public static void main(String [] args){
        int n = 25;

        boolean[] isPrime = new boolean[n];
        isPrime[0] = false;

        for(int i = 1; i < n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i <= n; i++){
            if(isPrime[i-1]) {
                System.out.print(i + " ");


                for (int j = i * i; j <= n; j += i) {
                    isPrime[j - 1] = false;
                }
            }
        }
    }
}
