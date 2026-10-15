public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed == 10) {
            return (221 * speed) * 0.77 ;
        }
        else if (speed == 9) {
            return (221 * speed) * 0.8 ;
        }
        else if (speed <= 8 && speed >= 5) {
            return (221 * speed) * 0.9 ;
        }
        else if (speed <= 4 && speed >= 1) {
            return (221 * speed) ;
        }
        else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
