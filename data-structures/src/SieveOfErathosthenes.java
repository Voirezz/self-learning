public class SieveOfErathosthenes {
    public static void main(String [] args){
        int n = 25;

        //Making a boolean array and setting everything after 1 as true
        boolean[] isPrime = new boolean[n];
        isPrime[0] = false;

        for(int i = 1; i < n; i++){
            isPrime[i] = true;
        }

        //Check if it's a prime number, if it is prints it out
        for(int i = 2; i <= n; i++){
            if(isPrime[i-1]) {
                System.out.print(i + " ");

                //Marks the multiples of the prime number as not prime.
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j - 1] = false;
                }
            }
        }
    }
}
