public class RunningAverage {
    private int count;
    private double average;

    public RunningAverage() {
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double newVal) {
        double total = average * count;
        count++;
        average = (total + newVal) / count;
    }

    public int processNewRatings(int num) {
        int invalid = 0;

        for (int i = 0; i < num; i++) {
            double rating = getNewRating();

            if (rating >= 0) {
                updateAverage(rating);
            } else {
                invalid++;
            }
        }

        return invalid;
    }

    public double getNewRating() {
        return 0.0;
    }
}