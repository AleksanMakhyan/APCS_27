public class StepTracker {
    private int minimumSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minimumSteps) {
        this.minimumSteps = minimumSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;

        if (steps >= minimumSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }

        return (double) totalSteps / totalDays;
    }
}