public class interview_basics {
    public static void main(String[] args) {
        int[] jumpLengths = {22, 17, 14};
        int[] restIntervals = {1, 2, 4};
        int[] restsTaken = {0, 0, 0};
        int[] distances = {0, 0, 0};

        int totalTime = 10; // Replace with the actual time in seconds

        for (int time = 0; time < totalTime; time++) {
            for (int i = 0; i < 3; i++) {
                if (time % (2 + restIntervals[i]) < 2) {
                    distances[i] += jumpLengths[i];
                } else {
                    restsTaken[i]++;
                }
            }
        }

        int winner = findWinner(distances);
        System.out.println("Winner: Frog " + (winner + 1) + " Distance: " + distances[winner] + " centimeters");
    }

    private static int findWinner(int[] distances) {
        int winner = 0;
        for (int i = 1; i < distances.length; i++) {
            if (distances[i] > distances[winner]) {
                winner = i;
            }
        }
        return winner;
}
}
