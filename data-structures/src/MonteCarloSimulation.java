public class MonteCarloSimulation {
    public static void main(String [] args) {
        int N = 1000000;
        int success = 0;

        for (int i = 0; i < N; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;

            if (sum == 7 || sum == 11) {
                success++;
            }
        }

            double probability = (double) (100 * success) / (double) N;
            probability = Math.round(probability * 100.0) / 100.0;
            System.out.println(probability);
    }
}

