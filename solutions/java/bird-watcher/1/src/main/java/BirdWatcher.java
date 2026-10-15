
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birds = { 0, 2, 5, 3, 7, 8, 4 };
        return birds;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird: birdsPerDay){
            if(bird == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        int limite = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limite; i++){
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int busyDay = 0;
        for(int bird: birdsPerDay){
            if(bird >= 5){
                busyDay++;
            }
        }
        return busyDay;
    }
}
