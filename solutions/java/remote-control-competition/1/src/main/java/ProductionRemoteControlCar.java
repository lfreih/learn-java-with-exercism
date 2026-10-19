class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance = 0;
    private int distanceUnit = 10;
    private int nbOfVictories = 0;
    
    public void drive() {
        distance += distanceUnit;
    }

    public int getDistanceTravelled() {
        return distance ;
    }

    public int getNumberOfVictories() {
        return nbOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        nbOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.nbOfVictories, this.nbOfVictories);
    }
}
