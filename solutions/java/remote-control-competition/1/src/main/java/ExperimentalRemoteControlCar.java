public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distance = 0;
    private int distanceUnit = 20;
    
    public void drive() {
        distance += distanceUnit;
    }

    public int getDistanceTravelled() {
        return distance ;
    }
}
