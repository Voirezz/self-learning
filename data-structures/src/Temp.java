import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Temp {
    public static void main(String [] args){
        int start = 20;
        int end = 50;
        System.out.println(sophieGermain(start,end));

    }

    public static int sophieGermain(int start, int end) {
        int maxCheck = 2 * end + 1;
        boolean[] isPrime = new boolean[maxCheck + 1];

        for(int i = 2; i < maxCheck; i++){
            isPrime[i] = true;
        }

        //Sieve of Erathosthenes
        for (int i = 2; i <= Math.sqrt(maxCheck); i++) {
            if (isPrime[i]) {
                for (int k = i * i; k <= maxCheck; k += i) {
                    isPrime[k] = false;
                }
            }
        }

        int sum = 0;

        //checker
        for (int i = start; i <= end; i++) {
            if (isPrime[i] && isPrime[2 * i + 1]) {
                sum += i;

            }
        }return sum;
    }
}
